package array5;
import javax.swing.JOptionPane;
public class Array5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int counter = 0;
        int harga[] = new int [2];
        
        do
        {
            String input = JOptionPane.showInputDialog("Masukan harga");
            harga[counter]=Integer.parseInt(input);
            counter++;
        }while(counter<harga.length);
        
        for(int i = 0; i<harga.length; i++)
        {
            System.out.println("Harga barang ke" +i+"adalah "+harga[i]);
            
        }
    }
    
}
