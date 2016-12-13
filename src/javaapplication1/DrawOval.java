/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author silus
 */
public class DrawOval extends JPanel{
    private int d = 10;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(10, 10, d, d);
    }
    
    public void setD(int newD) {
        d = (newD >= 0) ? newD : 10;
        repaint();
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }
    
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
