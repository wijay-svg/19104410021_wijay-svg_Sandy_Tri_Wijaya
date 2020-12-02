package tugas.praktikum.penerapan.pkgswitch.pkgcase.dan.perulangan.pkgfor;

import javax.swing.JOptionPane;
public class TugasPraktikumPenerapanSwitchCaseDanPerulanganFor {
    public static void main(String[] args) 
    {
     int nomor;
     String Pencarian;
     
     System.out.println("Pencarian Data");
     System.out.println("1.Mencari Data dengan Mengurutkan dari atas.");
     System.out.println("2.Mencari Data dengan Mengurutkan dari bawah.");
     System.out.println("3.Menentukan Nomer Ganjil Genap.");
     System.out.println("4.Mencari Volume Kerucut.");
     Pencarian = JOptionPane.showInputDialog("Masukan Pencarian : ");
     int pilihan = Integer.parseInt(Pencarian);
     switch(pilihan)
     {
         case 1:
            
            int Number;
            String data = JOptionPane.showInputDialog("Masukan Data Angka");
            Number = Integer.parseInt(data);
            int[] Nm = new int [Number];
            for (int i = 0; i < Number; i++)
            {
                String bg= JOptionPane.showInputDialog("Nilai " +(i+1)+ " : ");
                Nm[i] = Integer.parseInt(bg);
            }
        for(int i = 0; i < Number-1; i++)
        {
           
            boolean tukar = false;
            int index = 0;
            int min = Nm[i];
            
            for(int y = i+1; y < Number; y++)
            {
                if(min > Nm[y])
                {
                    tukar = true;
                    index = y;
                    min = Nm[y];
                     
                }
            }
             
            if(tukar == true)
            {
                int temp = Nm[i];
                Nm[i] = Nm[index];
                Nm[index] = temp;
            }
            System.out.println("lihat hasil : ");
            for(int y = 0; y < Number; y++)
            {
              System.out.println(Nm[y]+" ");
            }
        }
        break;
         case 2:
             
            int Nomer;
            String angka = JOptionPane.showInputDialog("Masukan Data Angka");
            Nomer = Integer.parseInt(angka);
            int[] Ls = new int [Nomer];
            for (int i = 0; i < Nomer; i++)
            {
                String bg= JOptionPane.showInputDialog("Nilai " +(i+1)+ " : ");
                Ls[i] = Integer.parseInt(bg);
            }
            
        for(int i = 0; i < Nomer-1; i++)
        {
            boolean tukar = false;
            int index = 0;
            int min = Ls[i];
            
            for(int y = i+1; y < Nomer; y++)
            {
                if(min < Ls[y])
                {
                    tukar = true;
                    index = y;
                    min = Ls[y];
                     
                }
            }
            if(tukar == true)
            {
                int temp = Ls[i];
                Ls[i] = Ls[index];
                Ls[index] = temp;
            }
            System.out.println("lihat hasil : ");
            for(int y = 0; y < Nomer; y++)
            {
              System.out.println(Ls[y]+" ");
            } 
        }
        break;
        case 3:
                
                String Ang = JOptionPane.showInputDialog("Masukan angka");
                int Angka = Integer.parseInt(Ang);
                if(Angka % 2 == 1)
                {
                    System.out.println("angka ini ganjil");
                }
                else
                {
                    System.out.println("angka ini genap");
                }
                break;
        case 4:
            
            double Luas_Alas;
            double Tinggi;
            double Volume;
            String kerucut = JOptionPane.showInputDialog("Masukan Luas Alas");
            Luas_Alas = Double.parseDouble(kerucut);
            String Kerucut = JOptionPane.showInputDialog("Masukan Tinggi");
            Tinggi = Double.parseDouble(Kerucut);
            
            Volume = 1/3 * Luas_Alas * Tinggi;
            
            System.out.println("Volume Kerucut = " + Volume);
            break;
        
        default :
            System.out.println("Pilihan anda tidak ada");
            break;
    }
  }
