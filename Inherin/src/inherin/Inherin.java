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

    public void setBuku_sejarah(String judul,String pengarang,String penerbit,String tahun) {
        this.buku_sejarah = ( "Buku Sejarah \n\n" +
                "Judul : " + judul+
                "\nNama Pengarang : " + pengarang +
                "\nPenerbit : " + penerbit +
                "\nTahun Cetak : " + tahun);
    }

    public String getBuku_teknologi() {
        return buku_teknologi;
    }

    public void setBuku_teknologi(String judul1,String pengarang1,String penerbit1,String tahun1) {
        this.buku_teknologi = ( "\n\nBuku Teknologi \n\n" +
                "Judul : " + judul1+
                "\nNama Pengarang : " + pengarang1 +
                "\nPenerbit : " + penerbit1 +
                "\nTahun Cetak : " + tahun1);
    }

    public String getBuku_bisnis() {
        return buku_bisnis;
    }

    public void setBuku_bisnis(String judul2,String pengarang2,String penerbit2,String tahun2) {
        this.buku_bisnis = ( "\n\nBuku Bisnis \n\n" +
                "Judul : " + judul2+
                "\nNama Pengarang : " + pengarang2 +
                "\nPenerbit : " + penerbit2 +
                "\nTahun Cetak : " + tahun2);
    }
}
