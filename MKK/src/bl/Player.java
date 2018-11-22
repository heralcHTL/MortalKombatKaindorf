/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public abstract class Player {
    String name;
    int attack;
    int defense;
    int healthpoints;
    private LinkedList<Item> eqItems = new LinkedList<>();
    
    public Player(String name, int attack, int defense, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.healthpoints = hp;
    }
    
    public void fight(Player enemy) // Der Herausgeforderte attackiert zuerst
    {
        System.out.println(enemy.getName());
        System.out.println(enemy.getName());
        System.out.println(enemy.getName());
        System.out.println(enemy.getName());
        System.out.println(enemy.getName());
        int atk = this.attack + eqItemATK();
        int def = this.defense + eqItemDEF();
        int hp = this.healthpoints;
        
        int enatk = enemy.getAttack() + enemy.eqItemATK();
        int endef = enemy.getDefense() + enemy.eqItemDEF();
        int enhp = enemy.getHp();
        
        boolean turn = false;                                                   // false = enemy turn; true = you turn
        
        System.out.println("Your HP: " + hp);
        System.out.println("Enemy HP: " + enhp);
        
        System.out.println(this.getName() + " stats: " + atk + " - " + def);
        System.out.println(enemy.getName() + " stats: " + enatk + " - " + endef);
        while(true)
        {
            if(hp <= 0)       //you died
            {
                JOptionPane.showMessageDialog(null, enemy.getName() + " WON");
                return;
            }
            if(enhp <= 0)    //enemy died
            {
                JOptionPane.showMessageDialog(null, this.getName() + " WON");
                return;
            }
            if(turn == false) //enemy attack
            {
                int dmg = enatk - defense;
                hp = hp - dmg;
                System.out.println("Your HP: " + hp);
                turn = true;
            }
            else if(turn == true) //you attack
            {
                int dmg = atk - endef;
                enhp = enhp - dmg;
                System.out.println("Enemy HP: " + enhp);
                turn = false;
            }
        }
        
    }
    
    public int eqItemATK()
    {
        int redmg = 0;
        for (Item eqItem : eqItems)
        {
            redmg += eqItem.getDeltaAttack();
        }
        return redmg;
    }
    
    public int eqItemDEF()
    {
        int redef = 0;
        for (Item eqItem : eqItems)
        {
            redef += eqItem.getDeltaDefense();
        }
        return redef;
    }
    
    public void addItem(Item item)
    {
        this.attack += item.getDeltaAttack();
        this.defense += item.getDeltaDefense();
        this.eqItems.add(item);
    }
    
    public void removeItem(Item item)
    {
        
    }

    public String getType() {
        if(this instanceof Human){
            return "Human";
        }
        else
        {
            return "Orc";
        }
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
        return healthpoints;
    }

    public LinkedList<Item> getEqItems() {
        return eqItems;
    }
    
}
