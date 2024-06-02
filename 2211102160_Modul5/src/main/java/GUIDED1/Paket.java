/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
/** Kelas Paket merupakan turunan dari Buku dan mengimplementasikan interface InterfaceCD */
class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;

    // Konstruktor untuk menginisialisasi atribut Paket
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }
// Metode untuk menghitung harga paket
    public void hitungHargaPaket() {
        hargaPaket = super.hargaBuku + getHargaCD();
    }
    // Metode untuk mencetak detail CD
    public void cetakCD() {
        interfaceCD.cetakCD();
    }

    // Metode untuk mendapatkan harga CD
    public long getHargaCD() {
        return (interfaceCD.getHargaCD());
    }
// Metode untuk mencetak detail paket
    public void cetakPaket() {
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp " + hargaPaket + "\n");
    }
}