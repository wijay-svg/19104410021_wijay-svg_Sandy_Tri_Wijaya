/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum.pkgif.pkgelse;

import javax.swing.JOptionPane;

public class Tugas_praktikum_if_else {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Nilai IPA");
        double hasil = Double.parseDouble(input);
        
        
        if(hasil > 70)
        {
             System.out.println("nilai baik");
        }
        else if(hasil >= 50)
        {
            System.out.println("nilai cukup");
        }
        else
        {
            System.out.println("nilai buruk");
        }
        
        String nilai = JOptionPane.showInputDialog("Nilai Mat");
        double Pack = Double.parseDouble(nilai);
        
        
        if(Pack > 70)
        {
             System.out.println("nilai baik");
        }
        else if(Pack >= 50)
        {
            System.out.println("nilai cukup");
        }
        else
        {
            System.out.println("nilai buruk");
        }
    }
    
}
