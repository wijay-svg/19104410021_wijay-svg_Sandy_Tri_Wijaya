/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherin;

/**
 *
 * @author AXZ
 */
public class Inherin {

    String buku_sejarah;
    String buku_teknologi;
    String buku_bisnis;
    
    public String getBuku_sejarah() {
        return buku_sejarah;
    }

    public void setBuku_sejarah(String judul,String pengarang,String penerbit,String tahun,String kategori) {
        this.buku_sejarah = ("Buku Sejarah \n\n" +
                "Judul \t\t\t: " + judul+
                "\nNama Pengarang \t\t: " + pengarang +
                "\nPenerbit   \t\t: " + penerbit +
                "\nTahun Cetak\t\t: " + tahun + 
                "\nKategori   \t\t: " + kategori +
                "\n______________________________________"); 
                
    }

    public String getBuku_teknologi() {
        return buku_teknologi;
    }

    public void setBuku_teknologi(String judul1,String pengarang1,String penerbit1,String tahun1,String kategori1) {
        this.buku_teknologi = ( "\n\nBuku Teknologi \n\n" +
                "Judul \t\t\t: " + judul1+
                "\nNama Pengarang \t\t: " + pengarang1 +
                "\nPenerbit   \t\t: " + penerbit1 +
                "\nTahun Cetak\t\t: " + tahun1 +
                "\nKategori   \t\t: " + kategori1 + 
                "\n______________________________________");
    }

    public String getBuku_bisnis() {
        return buku_bisnis;
    }

    public void setBuku_bisnis(String judul2,String pengarang2,String penerbit2,String tahun2,String kategori2) {
        this.buku_bisnis = ( "\n\nBuku Bisnis \n\n" +
                "Judul \t\t\t: " + judul2+
                "\nNama Pengarang \t\t: " + pengarang2 +
                "\nPenerbit   \t\t: " + penerbit2 +
                "\nTahun Cetak\t\t: " + tahun2 +
                "\nKategori   \t\t: " + kategori2 +
                "\n______________________________________");
    }
}
