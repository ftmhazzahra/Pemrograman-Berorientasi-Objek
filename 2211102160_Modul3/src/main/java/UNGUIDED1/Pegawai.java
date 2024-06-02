/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K
class Pegawai {
    // Atribut
    private String NIP;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;
    private double totalGaji;

    // Konstruktor
    public Pegawai(String NIP, String nama, String alamat, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPokok = gajiPokok;
        this.jumlahHariLembur = 0;
        this.totalGaji = gajiPokok; // Total gaji awal sama dengan gaji pokok
    }

    // Destruktor
    protected void finalize() {
        System.out.println("Objek Pegawai dengan NIP " + NIP + " telah dihapus.");
    }

    // Fungsi Accessor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    // Fungsi Mutator
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    // Method Overloading untuk perhitungan total gaji
    public void hitungTotalGaji() {
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }
}
