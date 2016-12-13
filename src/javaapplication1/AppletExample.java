/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author silus
 */
public class AppletExample extends JApplet{
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("wow this actually works", 25, 25);
    }
}
