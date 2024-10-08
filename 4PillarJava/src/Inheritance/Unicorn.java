/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 * @author ILHAM
 */
class Unicorn extends MakhlukMitos {
    public Unicorn(String nama) {
        super(nama, "Unicorn");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari dengan cepat.");
    }
}