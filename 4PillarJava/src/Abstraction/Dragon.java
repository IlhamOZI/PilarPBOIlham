/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;
import Abstract2.MythicalCreature;
/**
 * @author ILHAM
 */
public class Dragon extends MythicalCreature {

    public Dragon() {
        super("Dragon");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars with a fiery breath!");
    }

    @Override
    public void showAbility() {
        System.out.println(getName() + " can fly and breathe fire.");
    }
}
