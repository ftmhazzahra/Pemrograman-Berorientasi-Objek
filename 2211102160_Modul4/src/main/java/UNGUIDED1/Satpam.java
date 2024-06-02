/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra_2211102160_IF10K
// Kelas turunan Satpam yang mewarisi kelas Pegawai
class Satpam extends Pegawai {
    private double gajiPokok;
    private int jamLembur;

    // Konstruktor untuk inisialisasi data Satpam
    public Satpam(String NIP, String nama, String alamat, int tahunMasukKerja, double gajiPokok, int jamLembur) {
        super(NIP, nama, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }

    // Override method displayInfo() dari superclass Pegawai
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", gajiPokok)); // Format gaji dengan pemisah ribuan dan mata uang
        System.out.println("Jam Lembur: " + jamLembur);
    }
}
