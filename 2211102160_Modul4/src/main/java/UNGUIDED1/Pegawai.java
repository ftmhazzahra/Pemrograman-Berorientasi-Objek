/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra_2211102160_IF10K
// Kelas induk Pegawai yang akan diwarisi oleh kelas-kelas turunannya
class Pegawai {
    protected String NIP; 
    protected String nama;
    protected String alamat;
    protected int tahunMasukKerja;

    // Konstruktor untuk inisialisasi data pegawai
    public Pegawai(String NIP, String nama, String alamat, int tahunMasukKerja) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
    }

    // Method untuk menampilkan informasi pegawai
    public void displayInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tahun Masuk Kerja: " + tahunMasukKerja);
    }
}
