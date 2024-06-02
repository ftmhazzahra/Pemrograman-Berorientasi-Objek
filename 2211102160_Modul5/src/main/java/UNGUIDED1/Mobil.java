/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
public class Mobil {
    protected String noPlat; // Nomor plat mobil
    protected String merk; // Merk mobil
    protected float pajak; // Besar pajak mobil

    public Mobil() {} // Konstruktor default

    // Konstruktor dengan parameter
    public Mobil(String noPlat, String merk, float pajak) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilInfo() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Pajak: Rp" + pajak);
    }
}