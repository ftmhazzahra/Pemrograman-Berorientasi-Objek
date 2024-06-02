/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai = new Pegawai("2211102160", "Fatimah Az Zahra", "Jalan DI Panjaitan gg. Bakso Sami Asih", 50000000);

        // Membuat format untuk menampilkan gaji dalam format desimal
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        // Menampilkan data awal pegawai
        System.out.println("Data Pegawai Awal:");
        System.out.println("NIP: " + pegawai.getNIP());
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Gaji Pokok: Rp " + decimalFormat.format(pegawai.getGajiPokok()));
        System.out.println("Jumlah Hari Lembur: " + pegawai.getJumlahHariLembur());

        // Menjalankan method untuk menghitung total gaji
        pegawai.hitungTotalGaji();
        System.out.println("Total Gaji: Rp " + decimalFormat.format(pegawai.getTotalGaji()));

        // Memperbarui data jumlah hari lembur
        pegawai.setJumlahHariLembur(5);

        // Menampilkan data pegawai setelah pembaruan
        System.out.println("\nData Pegawai Setelah Pembaruan:");
        System.out.println("NIP: " + pegawai.getNIP());
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Gaji Pokok: Rp " + decimalFormat.format(pegawai.getGajiPokok()));
        System.out.println("Jumlah Hari Lembur: " + pegawai.getJumlahHariLembur());

        // Menjalankan method untuk menghitung total gaji setelah pembaruan
        pegawai.hitungTotalGaji();
        System.out.println("Total Gaji (setelah pembaruan): Rp" + decimalFormat.format(pegawai.getTotalGaji()));
    }
}
