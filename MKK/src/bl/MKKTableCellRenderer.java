/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alex
 */
public class MKKTableCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Player p = (Player) o;
        JLabel lb = new JLabel();
        lb.setOpaque(true);
        
        if(o instanceof Human)
        {
            lb.setBackground(Color.cyan);
            lb.setForeground(Color.BLACK);
        }
        else if(o instanceof Orc)
        {
            lb.setBackground(Color.green.darker());
            lb.setForeground(Color.BLACK);
        }
        
        
        if(lb.hasFocus())
        {
            System.out.println("laskjdflöj");
            lb.setBackground(Color.red.brighter());
        }
        
        
        switch(i1)
        {
            case 0: lb.setText(p.getType());break;
            case 1: lb.setText(p.getName());break;
            case 2: lb.setText(p.getAttack()+"");break;
            case 3: lb.setText(p.getDefense()+"");break;
            case 4: lb.setText(p.getHp()+"");break;
            default: lb.setText("???");
        }
        return lb;
    }
    
}
