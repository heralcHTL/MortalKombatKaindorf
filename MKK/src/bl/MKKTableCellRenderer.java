/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alex
 */
public class MKKTableCellRenderer implements TableCellRenderer{

    private String humanPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "res" + File.separator + "God.jpg";
    private String orcPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "res" + File.separator + "Shronk.jpg";
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {        
        Player p = (Player) o;
        JLabel lb = new JLabel();
        lb.setOpaque(true);
        jtable.setRowHeight(70);

        if (o instanceof Human)
        {
            if (i1 != 0)
            {
                lb.setBackground(Color.red);
                lb.setForeground(Color.BLACK);
            }
            else
            {
                try
                {
                    Image img = ImageIO.read(new File(humanPath));
                    img = img.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
                    lb.setIcon(new ImageIcon(img));

                } catch (IOException ex)
                {
                    Logger.getLogger(MKKTableCellRenderer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if (o instanceof Orc)
        {
            if (i1 != 0)
            {
                lb.setBackground(Color.green.darker());
                lb.setForeground(Color.BLACK);
            }
            else
            {
                try
                {
                    Image img = ImageIO.read(new File(orcPath));
                    img = img.getScaledInstance(120, 70, Image.SCALE_SMOOTH);
                    lb.setIcon(new ImageIcon(img));

                } catch (IOException ex)
                {
                    Logger.getLogger(MKKTableCellRenderer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        if(lb.hasFocus())
        {
            System.out.println("laskjdflöj");
            lb.setBackground(Color.red.brighter());
        }
        
        switch(i1)
        {
            case 1: lb.setText(p.getName());break;
            case 2: lb.setText(p.getAttack()+"");break;
            case 3: lb.setText(p.getDefense()+"");break;
            case 4: lb.setText(p.getHp()+"");break;
        }
        return lb;
    }
    
}
