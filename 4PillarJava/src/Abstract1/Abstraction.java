/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract1;

import Abstract2.MythicalCreature;
import Abstraction.Phoenix;
import Abstraction.Dragon;
/**
 * @author ILHAM
 */

public class Abstraction{
        public static void main(String[] args) {
        MythicalCreature dragon = new Dragon();
        MythicalCreature phoenix = new Phoenix();

        System.out.println("Dragon:");
        dragon.makeSound();
        dragon.showAbility();

        System.out.println();

        System.out.println("Phoenix:");
        phoenix.makeSound();
        phoenix.showAbility();
        }
    }