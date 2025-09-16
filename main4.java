/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

/**
 *
 * @author Admin
 */
abstract class itemperpustakaan {

    protected String judul;
    protected int tahunterbit;

    public itemperpustakaan(String judul, int tahunterbit) {
        this.judul = judul;
        this.tahunterbit = tahunterbit;
    }

    public void tampilkaninfo() {
        System.out.println("judul: " + judul + " | tahun terbit: " + tahunterbit);
    }

    public abstract void tampilkandetail();
}

class buku extends itemperpustakaan {

    private String pengarang;
    private int jumlahhalaman;

    public buku(String judul, int tahunterbit, String pengarang, int jumlahhalaman) {
        super(judul, tahunterbit);
        this.pengarang = pengarang;
        this.jumlahhalaman = jumlahhalaman;
    }

    @Override
    public void tampilkandetail() {
        System.out.println("pengarang: " + pengarang + " | halaman: " + jumlahhalaman);
    }
}

class majalah extends itemperpustakaan {

    private int edisi;
    private int volume;

    public majalah(String judul, int tahunterbit, int edisi, int volume) {
        super(judul, tahunterbit);
        this.edisi = edisi;
        this.volume = volume;
    }

    @Override
    public void tampilkandetail() {
        System.out.println("edisi: " + edisi + " | volume: " + volume);
    }
}

class dvd extends itemperpustakaan {

    private int durasi;
    private String genre;

    public dvd(String judul, int tahunterbit, int durasi, String genre) {
        super(judul, tahunterbit);
        this.durasi = durasi;
        this.genre = genre;
    }

    @Override
    public void tampilkandetail() {
        System.out.println("Durasi: " + durasi + " menit | Genre: " + genre);
    }
}

public class main4 {

    public static void main(String[] args) {
        itemperpustakaan buku = new buku("Pemrograman Java", 2022, "Andi", 350);
        itemperpustakaan majalah = new majalah("National Geographic", 2021, 5, 12);
        itemperpustakaan dvd = new dvd("Inception", 2010, 148, "Sci-Fi");

        buku.tampilkaninfo();
        buku.tampilkandetail();

        majalah.tampilkaninfo();
        majalah.tampilkandetail();

        dvd.tampilkaninfo();
        dvd.tampilkandetail();
    }
}
