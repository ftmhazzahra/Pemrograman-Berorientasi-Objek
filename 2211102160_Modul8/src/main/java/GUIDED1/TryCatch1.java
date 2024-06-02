/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1; // Menyatakan bahwa kelas ini berada di dalam paket GUIDED1
// Fatimah Az Zahra-2211102160-IF10K

public class TryCatch1 {

    public static void main(String[] args) {
        try { // Memulai blok try untuk menangani kode yang mungkin menghasilkan exception
            int[] arr = new int[1]; // Mendeklarasikan dan menginisialisasi array dengan 1 elemen
            System.out.println(arr[1]); // Mencoba mengakses elemen kedua dari array yang tidak ada
            System.out.println(
            "Baris ini tidak akan dieksekusi, karena statement baris diatas terjadi exception");
            // Baris ini tidak akan dieksekusi karena akan terjadi exception pada baris sebelumnya
        } catch (ArrayIndexOutOfBoundsException e) { // Menangkap exception jika terjadi
            System.out.println("Terjadi exception karena indeks di luar kapasitas array");
            // Pesan yang ditampilkan jika ada exception ArrayIndexOutOfBoundsException
        }
        System.out.println("Setelah blok try catch");
        // Baris ini akan dieksekusi setelah blok try-catch, terlepas dari apakah terjadi exception atau tidak
    }
}
