/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Óscar Andrés Mancera Garzón
 * Oscar Eduardo Porras Junco
 * Daniel Yara Sepúlveda
 * Sebastian Castañeda Romero
 */
public class Producto {

    private int codigo;
    private String descripcion;
    private double precioUnidad;

    public Producto(int codigo, String descripcion, double precioUnidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Producto getProducto(Producto[] producto, int codigo) {
        for (int i = 0; producto[i] != null; i++) {
            if (producto[i].getCodigo() == codigo) {
                return producto[i];
            }
        }
        return null;
    }
}
