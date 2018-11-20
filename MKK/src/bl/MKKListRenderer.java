/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Alex
 */
public class MKKListRenderer implements ListCellRenderer<Object>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> jlist, Object e, int i, boolean bln, boolean bln1) {
        JLabel lb = new JLabel();
        lb.setOpaque(true);
        
        Player p = (Player) e;
        lb.setText(p.getType());
        lb.setBackground(Color.gray.darker());
        lb.setForeground(Color.white.darker());
        return lb;
    }
    
}
