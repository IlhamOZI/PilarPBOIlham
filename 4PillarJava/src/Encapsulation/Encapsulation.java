/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 * @author ILHAM
 */
public class Encapsulation {
    public static void main(String[] args) {
        IkanMitos ikan1 = new IkanMitos("Ikan Sirip Emas", "Lepidoteuthis", 50.0);
        IkanMitos ikan2 = new IkanMitos("Ikan Hiu Kristal", "Carcharodon", 200.0);

        ikan1.tampilkanInfo();
        System.out.println();
        ikan2.tampilkanInfo();
    }
}