/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
// Fatimah Az Zahra_2211102160_IF10K
// Kelas turunan Sales yang mewarisi kelas Pegawai
class Sales extends Pegawai {
    private double gajiPokok;
    private int jumlahPelanggan;

    // Konstruktor untuk inisialisasi data Sales
    public Sales(String NIP, String nama, String alamat, int tahunMasukKerja, double gajiPokok, int jumlahPelanggan) {
        super(NIP, nama, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }

    // Override method displayInfo() dari superclass Pegawai
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", gajiPokok)); // Format gaji dengan pemisah ribuan dan mata uang
        System.out.println("Jumlah Pelanggan: " + jumlahPelanggan);
    }
}

