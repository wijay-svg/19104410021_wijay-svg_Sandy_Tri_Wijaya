package tugas_praktikum.pkgif.pkgelse;

import javax.swing.JOptionPane;

public class Tugas_praktikum_if_else {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Harga Airpod");
        double hasil = Double.parseDouble(input);
        
        
        if(hasil > 1000000)
        {
             System.out.println("Harga Mahal");
        }
        else if(hasil >= 200000)
        {
            System.out.println("Harga Lumayan");
        }
        else
        {
            System.out.println("Harga Murah");
        }
        
        String nilai = JOptionPane.showInputDialog("Harga Laptop");
        double Pack = Double.parseDouble(nilai);
        
        
        if(Pack > 10000000)
        {
             System.out.println("Laptop Mahal");
        }
        else if(Pack >= 5000000)
        {
            System.out.println("Laptop Sedang");
        }
        else
        {
            System.out.println("Laptop Murah");
        }
    }
    
}
