/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;

//Fatimah Az Zahra - 2211102160 - IF-10-K
public class Bank {
    private int saldo;
    // Konstruktor class Bank
    public Bank(int saldo) {
        this.saldo = saldo;
    }
    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
    // Method untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("Maaf, saldo tidak mencukupi.");
        }
    }
    // Method untuk mendapatkan saldo
    public int getSaldo() {
        return saldo;
    }
}

