/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Alex
 */
public class MKKListModel extends AbstractListModel{

    private LinkedList<Item> liItem = new LinkedList<>();

    public LinkedList<Item> getLiItem() {
        return liItem;
    }

    public void setLiItem(LinkedList<Item> liItem) {
        this.liItem = liItem;
        this.fireIntervalAdded(this, 0, liItem.size());
    }
    
    @Override
    public int getSize() {
        return liItem.size();
    }

    @Override
    public Object getElementAt(int i) {
        return liItem.get(i).getTyp();
    }
    
}
