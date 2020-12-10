package latihan.array;

import javax.swing.JOptionPane;
public class LatihanArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukan nama");
        String tugas = JOptionPane.showInputDialog("Masukan nilai Tugas");
        String uts = JOptionPane.showInputDialog("Masukan nilai UTS");
        String uas = JOptionPane.showInputDialog("Masukan nilai UAS");
        String nama1 = JOptionPane.showInputDialog("Masukan nama");
        String tugas1 = JOptionPane.showInputDialog("Masukan nilai Tugas");
        String uts1 = JOptionPane.showInputDialog("Masukan nilai UTS");
        String uas1 = JOptionPane.showInputDialog("Masukan nilai UAS");
        String nama2 = JOptionPane.showInputDialog("Masukan nama");
        String tugas2 = JOptionPane.showInputDialog("Masukan nilai Tugas");
        String uts2 = JOptionPane.showInputDialog("Masukan nilai UTS");
        String uas2 = JOptionPane.showInputDialog("Masukan nilai UAS");
        String [][] isian = {
            {nama,tugas,uts,uas},
            {nama1,tugas1,uts1,uas1},
            {nama2,tugas2,uts2,uas2}
        };
        
        for (int i=0;i<isian.length;i++){
            System.out.println("Nama: "+isian[i][0]);
            System.out.println("Tugas: "+isian[i][1]);
            System.out.println("UTS: "+isian[i][2]);
            System.out.println("UAS: "+isian[i][3]);
            
            int tugas3, uts3, uas3;
            float rata2=0;
            tugas3 =Integer.parseInt(isian[i][1]);
            uts3 =Integer.parseInt(isian[i][2]);
            uas3 =Integer.parseInt(isian[i][3]);
            
            System.out.println();
            rata2=(tugas3+uts3+uas3)/3;
            System.out.println("Nilai rata2= "+rata2);
            
            if (rata2>80 && rata2<=100){
                System.out.println("Nilai huruf = A");
            }
            else if (rata2>70 && rata2<=79){
                System.out.println("Nilai huruf = B");
            }
            else if (rata2>60 && rata2<=69){
                System.out.println("Nilai huruf = C");
            }
            else if (rata2>50 && rata2<=59){
                System.out.println("Nilai huruf = D");
            }
            else if (rata2>0 && rata2<=49){
                System.out.println("Nilai huruf = E");
            }
            else{
                System.out.println("nilai ngaaco!");
            }
            System.out.println("-------------------");
        }
    }
    
}
