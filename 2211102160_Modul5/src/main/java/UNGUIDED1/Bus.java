/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
public class Bus extends Mobil {
    private int kapasitasPenumpang; // Variabel untuk menyimpan kapasitas penumpang bus
    private int kapasitasBagasi; // Variabel untuk menyimpan kapasitas bagasi bus

    public Bus() {} // Konstruktor default

    // Konstruktor dengan parameter
    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi) {
        super(noPlat, merk, pajak); // Memanggil konstruktor kelas induk (Mobil)
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    // Metode setter untuk mengatur nilai kapasitasPenumpang
    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Metode setter untuk mengatur nilai kapasitasBagasi
    public void setKapasitasBagasi(int kapasitasBagasi) {
        this.kapasitasBagasi = kapasitasBagasi;
    }

    // Metode untuk menampilkan informasi bus
    public void infoBus() {
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi: " + kapasitasBagasi);
    }

    // Override metode tampilInfo() dari kelas induk (Mobil)
    @Override
    public void tampilInfo() {
        super.tampilInfo(); // Memanggil metode tampilInfo() dari kelas induk (Mobil)
        infoBus(); // Memanggil metode infoBus() dari kelas Bus
    }

    // Metode untuk menghitung pajak bus
    public float hitungPajak() {
        return pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005f);
    }
}