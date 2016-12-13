/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Formatter;

/**
 *
 * @author silus
 */
class createfile {
    private Formatter x;
    
    void openFile() {
        try{
            x = new Formatter("fred.txt");
        }
        catch(Exception e){
            System.out.println("you have an error.");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addRecords() {
        x.format("%s%s%s\n", "21 ","Snsu ","Subudhi");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void closeFile() {
        x.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
