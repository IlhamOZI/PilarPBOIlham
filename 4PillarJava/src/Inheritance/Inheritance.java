/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 * @author ILHAM
 */
public class Inheritance {
    public static void main(String[] args) {
        Naga naga = new Naga("Naga Api");
        Unicorn unicorn = new Unicorn("Unicorn Emas");

        naga.tampilkanInfo();
        naga.terbang();
        
        System.out.println();

        unicorn.tampilkanInfo();
        unicorn.berlari();
    }
}