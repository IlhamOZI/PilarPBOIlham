/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract2;
/**
 * @author ILHAM
 */
public abstract class MythicalCreature {
    protected String name;
    
    public MythicalCreature(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void makeSound();
    public abstract void showAbility();
}
