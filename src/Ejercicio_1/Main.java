/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;
import java.util.Date;
/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jon Java", "jj@javauniv.edu");
        LibraryCard card1 = new LibraryCard(3);
        LibraryCard card2 = new LibraryCard(0);
        card1.setOwner(student);
        card2.setOwner(student);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(student.toString());

    }

}
