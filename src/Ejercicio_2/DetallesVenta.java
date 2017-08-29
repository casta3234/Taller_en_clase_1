/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Óscar Andrés Mancera Garzón
 * Óscar Andrés Mancera Garzón
 * Daniel Yara Sepúlveda
 * Sebastian Castañeda Romero
 */
public class DetallesVenta {

    private int unidadesVendidas;
    private int formaDeVenta;

    public DetallesVenta(int unidadesVendidas, int formaDeVenta) {
        this.unidadesVendidas = unidadesVendidas;
        this.formaDeVenta = formaDeVenta;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public int getFormaDeVenta() {
        return formaDeVenta;
    }

}
