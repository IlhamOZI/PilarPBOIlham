/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;
import Abstract2.MythicalCreature;

/**
 * @author ILHAM
 */
public class Phoenix extends MythicalCreature {

    public Phoenix() {
        super("Phoenix");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " sings a melodious, mystical tune!");
    }

    @Override
    public void showAbility() {
        System.out.println(getName() + " can be reborn from its ashes.");
    }
}