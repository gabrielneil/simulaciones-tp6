/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gabrielneil
 */
public class TableCellRenderColor extends DefaultTableCellRenderer {
    
    private Component componente;
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if (row%2 ==0) {
            componente.setBackground(Color.YELLOW);
        }
        return componente;
    }
}
