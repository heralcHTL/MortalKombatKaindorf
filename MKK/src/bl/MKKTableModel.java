/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class MKKTableModel extends AbstractTableModel{

    private LinkedList<Player> liPlayer = new LinkedList<>();
    private String[] colNames = {" ", "Name", "Atk", "Def", "HP"};
    
    public void addPlayer(Player p){
        liPlayer.add(p);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return liPlayer.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Player p = liPlayer.get(i);
        switch(i1){
            case 0: return "Type ?";
            case 1: return p.getName();
            case 2: return p.getAttack();
            case 3: return p.getDefense();
            case 4: return p.getHp();
            default: return "???";
        }
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
}
