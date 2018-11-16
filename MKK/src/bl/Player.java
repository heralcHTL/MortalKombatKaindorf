/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;

/**
 *
 * @author Alex
 */
public abstract class Player {
    String name;
    int attack;
    int defense;
    int hp;
    private LinkedList<Item> eqItems = new LinkedList<>();
    
    public Player(String name, int attack, int defense, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
    }
    
    public void fight(Player enemy)
    {
        
    }
    
    public void addItem(Item item)
    {
        
    }
    
    public void removeItem(Item item)
    {
        
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHp() {
        return hp;
    }

    public LinkedList<Item> getEqItems() {
        return eqItems;
    }
    
}
