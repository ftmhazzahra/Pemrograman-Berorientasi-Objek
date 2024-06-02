/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
public class Sedan extends Mobil {
    private String fasilitasKeamanan; // Fasilitas keamanan mobil
    private int kapasitasCC; // Kapasitas CC mobil
    private String fasilitasKenyamanan; // Fasilitas kenyamanan mobil

    public Sedan() {} // Konstruktor default

    // Konstruktor dengan parameter
    public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan) {
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
    }

    // Method untuk menampilkan informasi sedan
    public void infoSedan() {
        System.out.println("Fasilitas Keamanan: " + fasilitasKeamanan);
        System.out.println("Kapasitas CC: " + kapasitasCC);
        System.out.println("Fasilitas Kenyamanan: " + fasilitasKenyamanan);
    }

    // Override method tampilInfo() dari kelas Mobil
    @Override
    public void tampilInfo() {
        super.tampilInfo(); // Memanggil method tampilInfo() dari kelas induk
        infoSedan(); // Memanggil method infoSedan()
    }

    // Method untuk menghitung pajak sedan
    public float hitungPajak() {
        return pajak + (pajak + (pajak * kapasitasCC * 0.00005f));
    }
}