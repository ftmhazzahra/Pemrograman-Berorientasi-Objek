/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;

// Fatimah Az Zahra_2211102160_IF10K
// Kelas turunan Manajer yang mewarisi kelas Pegawai
class Manajer extends Pegawai {
    private double gajiPokok;
    private String divisi;

    // Konstruktor untuk inisialisasi data Manajer
    public Manajer(String NIP, String nama, String alamat, int tahunMasukKerja, double gajiPokok, String divisi) {
        super(NIP, nama, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }

    // Override method displayInfo() dari superclass Pegawai
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", gajiPokok)); // Format gaji dengan pemisah ribuan dan mata uang
        System.out.println("Divisi: " + divisi);
    }
}
