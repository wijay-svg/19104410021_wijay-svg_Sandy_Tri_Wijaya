/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class tance extends Inherin 
{   

    public static void main(String[] args)
    {
        ArrayList Daftar_buku = new ArrayList(); 
        String judul = JOptionPane.showInputDialog("Inputkan Judul Buku");
        String input = judul;
        String pengarang = JOptionPane.showInputDialog("Masukan Nama Pengarang");
        String input1 = pengarang;
        String penerbit = JOptionPane.showInputDialog("Masukan Penerbit");
        String input2 = penerbit;
        String tahun = JOptionPane.showInputDialog("Masukan Tahun Terbit");
        String input3 = tahun;
        String kate = JOptionPane.showInputDialog("Masukan Kategori");
        String input4 = String.valueOf(kate);
        String kategori = null;
        if (input4.equalsIgnoreCase("SU"))
        {
            kategori = "Semua Umur";
        }
        else if(input4.equalsIgnoreCase("R"))
        {
            kategori = "Remaja"; 
        }
        else if(input4.equalsIgnoreCase("D"))
        {
            kategori = "Dewasa"; 
        }
        else if(input4.equalsIgnoreCase("A"))
        {
            kategori = "Anak";
        }
        tance turunan = new tance();
        turunan.setBuku_sejarah(input,input1,input2,input3,kategori);
        Daftar_buku.add(turunan.getBuku_sejarah());
        
        String judul1 = JOptionPane.showInputDialog("Inputkan Judul Buku");
        String inp = judul1;
        String pengarang1 = JOptionPane.showInputDialog("Masukan Nama Pengarang");
        String inp1 = pengarang1;
        String penerbit1 = JOptionPane.showInputDialog("Masukan Penerbit");
        String inp2 = penerbit1;
        String tahun1 = JOptionPane.showInputDialog("Masukan Tahun Terbit");
        String inp3 = tahun1;
        String kat = JOptionPane.showInputDialog("Masukan Kategori");
        String inp4 = String.valueOf(kat);
        String kategori1 = null;
        if (inp4.equalsIgnoreCase("SU"))
        {
            kategori1 = "Semua Umur";
        }
        else if(inp4.equalsIgnoreCase("R"))
        {
            kategori1 = "Remaja"; 
        }
        else if(inp4.equalsIgnoreCase("D"))
        {
            kategori1 = "Dewasa"; 
        }
        else if(inp4.equalsIgnoreCase("A"))
        {
            kategori1 = "Anak";
        }
        tance turunan1 = new tance();
        turunan1.setBuku_teknologi(inp,inp1,inp2,inp3,kategori1);
        Daftar_buku.add(turunan1.getBuku_teknologi());
        
        String judul2 = JOptionPane.showInputDialog("Inputkan Judul Buku");
        String in = judul2;
        String pengarang2 = JOptionPane.showInputDialog("Masukan Nama Pengarang");
        String in1 = pengarang2;
        String penerbit2 = JOptionPane.showInputDialog("Masukan Penerbit");
        String in2 = penerbit2;
        String tahun2 = JOptionPane.showInputDialog("Masukan Tahun Terbit");
        String in3 = tahun2;
        String katego = JOptionPane.showInputDialog("Masukan Kategori");
        String in4 = String.valueOf(katego);
        String kategori2 = null;
        if (in4.equalsIgnoreCase("SU"))
        {
            kategori2 = "Semua Umur";
        }
        else if(in4.equalsIgnoreCase("R"))
        {
            kategori2 = "Remaja"; 
        }
        else if(in4.equalsIgnoreCase("D"))
        {
            kategori2 = "Dewasa"; 
        }
        else if(in4.equalsIgnoreCase("A"))
        {
            kategori2 = "Anak";
        }
        tance turunan2 = new tance();
        turunan2.setBuku_bisnis(in,in1,in2,in3,kategori2);
        Daftar_buku.add(turunan2.getBuku_bisnis());
        System.out.println(Daftar_buku);
    }
}
