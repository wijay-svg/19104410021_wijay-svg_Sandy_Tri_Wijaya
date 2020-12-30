/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author AXZ
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String ulg = "y";
        while (ulg.equals("y"))
        {
        Scanner ulang = new Scanner(System.in);
         String ul=" ",lagi;
        int nomor;
        String Pencarian;

        System.out.println("Pencarian Data");
        System.out.println("1.Deret Bilangan yang habis dibagi 3 dan 5");
        System.out.println("2.Deret Bilangan Prima");
        System.out.println("3.Deret Fibonacci");
        Pencarian = JOptionPane.showInputDialog("Masukan Pencarian : ");
        
        int pilihan = Integer.parseInt(Pencarian);
        switch(pilihan)
        {
         case 1:
            boolean cek = true;
            String ulangi;
            do {
                int min, max;
                int count = 0;
                String Nilai = JOptionPane.showInputDialog("Nilai awal: ");
                min = Integer.parseInt(Nilai); 
                String Nilai1 = JOptionPane.showInputDialog("Nilai akhir: ");
                max = Integer.parseInt(Nilai1);
                for (int i = min; i <= max; i++) {
                    if (i % 3 == 0 || i % 5 == 0) {
                        System.out.println(" " + i);
                        count += i;
                    }
                }
                System.out.println("hasil penjumlahan semua angka yang habis dibagi 3 dan 5 \nyang berada diantara " + min + "-" + max + " adalah " + count);
                String Inputan = JOptionPane.showInputDialog("Ulangi Lagi Y/N");
                ulangi = String.valueOf(Inputan);
                   if (ulangi.equalsIgnoreCase("N"))
                   {
                     cek = false;
                   }
            } while (cek);
        break;
         case 2:
             Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Nilai Akhir Bilangan Prima : ");
                int angka = input.nextInt();
                for(int b = 2; b <= angka; b++){
                    int mod = 1;
                    for(int c = 2; c < b; c++){
                        if (b % c == 0){
                            mod = 0;
                        }
                    }
                    if (mod == 1){
                        System.out.print(b+" ");
                    }
                }
            
        
        break;
        case 3:
                
                String Inputan = JOptionPane.showInputDialog("Masukan Jumlah Deret Fibonacci ");
		int Bilfib = Integer.parseInt(Inputan);
		long fib[] = new long[Bilfib];
		
		fib[0] = 1;
		fib[1] = 2;
		
		for(int i = 2; i < Bilfib; i++) 
                {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for (int i = 0; i < Bilfib; i++) 
                {
			System.out.print(fib[i] +  " ");
		}
                break;
        default :
            System.out.println("Pilihan anda tidak ada");
            break;
        }
         System.out.print("Apakah anda ingin mengulang ? y/n  = ");
         ulg = ulang.next();
        }
    }
    
}
