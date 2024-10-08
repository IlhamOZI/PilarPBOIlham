/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 * @author ILHAM
 */
public class IkanMitos {
    private String nama;
    private String spesies;
    private double panjang;

    public IkanMitos(String nama, String spesies, double panjang) {
        this.nama = nama;
        this.spesies = spesies;
        this.panjang = panjang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Ikan: " + nama);
        System.out.println("Spesies: " + spesies);
        System.out.println("Panjang: " + panjang + " cm");
    }
}