/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;

// Fatimah Az Zahra - 2211102160 -IF-10-K
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp. 100000
        Bank bankABC = new Bank(100000);

        // Menampilkan pesan selamat datang dan saldo awal
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        // Melakukan operasi simpan uang, ambil uang, dan menampilkan saldo
        bankABC.simpanUang(500000);
        bankABC.ambilUang(150000);
    }
}

