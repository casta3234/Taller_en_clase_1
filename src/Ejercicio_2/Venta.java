/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Date;

/**
 *
 * @author Óscar Andrés Mancera Garzón
 * Óscar Andrés Mancera Garzón
 * Daniel Yara Sepúlveda
 * Sebastian Castañeda Romero
 */
public class Venta {

    private Date fecha;
    private Producto producto;
    private Vendedor vendedor;
    private DetallesVenta detallesVenta;
    private double valorVenta;

    public Venta(Producto producto, Vendedor vendedor, DetallesVenta detallesVenta, Date fecha) {
        if (this.producto == null) {
            System.out.println("el codigo no existe venta no valida");
        } else {
            this.producto = producto;
            this.vendedor = vendedor;
            this.detallesVenta = detallesVenta;
            this.fecha = fecha;
            this.valorVenta = (this.producto.getPrecioUnidad() * this.detallesVenta.getUnidadesVendidas());
            imprimirFactura();
        }
    }

    public void imprimirFactura() {
        System.out.println("año:" + this.fecha.getYear() + " mes:" + this.fecha.getMonth()
                + " dia:" + this.fecha.getDay() + " hora:" + this.fecha.getHours());
        System.out.println("Vendedor: " + this.vendedor.getNombre() + " " + this.vendedor.getApellido()
                + " ID: " + this.vendedor.getId());
        System.out.println("codigo del producto: " + this.producto.getCodigo() + " nombre del producto: " + this.producto.getDescripcion()
                + " precio del product: " + this.producto.getPrecioUnidad() + " catidad vendida: " + this.detallesVenta.getUnidadesVendidas()
                + " valor total: " + this.valorVenta);
        switch (this.detallesVenta.getFormaDeVenta()) {
            case 0:
                System.out.println("se pago con efectivo");
                break;
            case 1:
                System.out.println("se pago con debito");
                break;
            case 2:
                System.out.println("se pago con credito");
                break;
        }

    }

    public double getValorVenta() {
        return valorVenta;
    }
}
