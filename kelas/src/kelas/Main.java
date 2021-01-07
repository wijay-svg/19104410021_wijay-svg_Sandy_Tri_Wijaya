package kelas;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main{
    
    public static void main(String[] args)
    {
        String Lagi = "Oke";
        while(Lagi.equals("Oke") || Lagi.equals("Oke")){
           Scanner hitung = new Scanner(System.in);
        double v, m;
        System.out.println("EK = 1 / 2 * v2 * m");
        String Kec = JOptionPane.showInputDialog("Masukan nilai kecepatan");
        v = Double.parseDouble(Kec);
        String Mas = JOptionPane.showInputDialog("Masukan nilai massa");
        m = Double.parseDouble(Mas);
        Kelas hasil = new Kelas();
        hasil.setKecepatan(v);
        hasil.setMassa(m);
        System.out.println("EK = "+hasil.getKinetik());
        System.out.println();
        System.out.println("Hitung Lagi : Ok || Oke or No || NO");
        Lagi = hitung.next();
        }
    }
}
