/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Óscar Andrés Mancera Garzón 
 * Óscar Andrés Mancera Garzón 
 * Daniel Yara Sepúlveda 
 * Sebastian Castañeda Romero
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuantos productos tiene");
        int numeroproductos = teclado.nextInt();
        int[] codigo = new int[numeroproductos];
        String[] descripcione = new String[numeroproductos];
        double[] precio = new double[numeroproductos];
        Producto[] producto = new Producto[numeroproductos + 1];
        for (int i = 0; i < numeroproductos; i++) {
            System.out.println("ingrese los datos para el producto " + (i + 1) + " en el siguiente orden codigo, descripcion, precio");
            codigo[i] = teclado.nextInt();
            descripcione[i] = teclado.next();
            precio[i] = teclado.nextDouble();
            producto[i] = new Producto(codigo[i], descripcione[i], precio[i]);
        }

        int[] dia = new int[20];
        int[] mes = new int[20];
        int[] año = new int[20];
        int[] hora = new int[20];
        String[] nombreVendedor = new String[20];
        String[] apellidoVendedor = new String[20];
        int[] idVendedor = new int[20];
        int[] codigoProducto = new int[20];
        int[] cantidadVendida = new int[20];
        int[] formaDePago = new int[20];
        Date[] fecha = new Date[20];
        Vendedor[] vendedor = new Vendedor[20];
        DetallesVenta[] detallesVenta = new DetallesVenta[20];
        Venta[] venta = new Venta[20];
        double valorDeTodasLasVentas = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("para registrar la venta ingrese los datos en el siguiente orden"
                    + " dia,mes,año,hora, nombre apellido e ID del vendedor, codigo del producto,cantidad vendida "
                    + "forma de pago(0-efectivo 1-debito 2-targeta),");
            dia[i] = teclado.nextInt();
            mes[i] = teclado.nextInt();
            año[i] = teclado.nextInt();
            hora[i] = teclado.nextInt();
            nombreVendedor[i] = teclado.next();
            apellidoVendedor[i] = teclado.next();
            idVendedor[i] = teclado.nextInt();
            codigoProducto[i] = teclado.nextInt();
            cantidadVendida[i] = teclado.nextInt();
            formaDePago[i] = teclado.nextInt();
            fecha[i] = new Date(año[i], mes[i], dia[i], hora[i], 0);
            vendedor[i] = new Vendedor(idVendedor[i], nombreVendedor[i], apellidoVendedor[i]);
            detallesVenta[i] = new DetallesVenta(cantidadVendida[i], formaDePago[i]);
            venta[i] = new Venta(producto[0].getProducto(producto, codigoProducto[i]), vendedor[i], detallesVenta[i], fecha[i]);
            valorDeTodasLasVentas = valorDeTodasLasVentas + venta[i].getValorVenta();
            System.out.println("quiere registrar otra venta(1:si , 0:no)");
            int n = teclado.nextInt();

            if (n <= 0) {
                i = 21;
            }
        }

        System.out.println("el valor de todas las ventas es: " + valorDeTodasLasVentas);

    }

}
