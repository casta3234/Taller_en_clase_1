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
public class Vendedor {

    private int id;
    private String nombre;
    private String apellido;
    private int cantidadDeVentas;

    public Vendedor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidadDeVentas = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

}
