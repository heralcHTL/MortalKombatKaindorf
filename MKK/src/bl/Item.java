/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Alex
 */
public abstract class Item {
    private int deltaAttack;
    private int deltaDefense;
    private String typ;

    public Item(int deltaAttack, int deltaDefense, String typ) {
        this.deltaAttack = deltaAttack;
        this.deltaDefense = deltaDefense;
        this.typ = typ;
    }
}
