/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Estudiante
 */
public class LibraryCard {

    private Student owner;
    private int borrowCnt;

    public LibraryCard(int b) {
        this.borrowCnt = b;
        this.owner = null;
    }

    public void checkOut(int n) {
        this.borrowCnt = this.borrowCnt - n;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public int getBorrowCnt() {
        return borrowCnt;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + ", borrowCnt=" + borrowCnt + '}';
    }



}
