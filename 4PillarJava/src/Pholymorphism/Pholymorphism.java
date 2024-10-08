/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pholymorphism;

/**
 * @author ILHAM
 */

public class Pholymorphism {
    public static void main(String []args){
    Harpy HARPY = new Harpy();
    Hewan HEWAN = new Hewan();
    Centaur CENTAUR = new Centaur();
    
    HEWAN.suara();
    
    HEWAN = CENTAUR;
    HEWAN.suara();
    
    HEWAN = HARPY;
    HEWAN.suara();
    }
    
}