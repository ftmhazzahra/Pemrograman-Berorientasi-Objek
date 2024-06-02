/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
//Fatimah Az Zahra_2211102160_IF10K
// Class Pegawai

class Pegawai {

    private String nama;
    private String NIP;

    public Pegawai() {
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    
    public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    
    public void tampilPeg() {
        System.out.println("NIP : " + NIP + " ,Nama : " + nama);
    }
}
