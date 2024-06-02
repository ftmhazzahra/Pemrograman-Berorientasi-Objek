/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K

import java.lang.Math;

// Deklarasi kelas SgtSamaSisi yang merupakan turunan dari kelas Titik.
class SgtSamaSisi extends Titik {

    // Variabel untuk menyimpan panjang sisi segitiga.
    double sisiSGT;

    // Konstruktor kelas SgtSamaSisi, menerima koordinat dua titik untuk menghitung sisi segitiga.
    SgtSamaSisi(double x1, double y1, double x2, double y2) {
        // Memanggil konstruktor kelas induk (Titik) dengan koordinat titik pertama (x1, y1).
        super(x1, y1);
        // Menghitung sisi segitiga
        this.sisiSGT = super.hitungJarak(new Titik(x2, y2));
    }

    // Metode untuk menghitung luas segitiga.
    double hitungLuas() {
        // Menggunakan rumus luas segitiga equilateral: luas = 0.5 * sisi * sqrt(3).
        return 0.5 * sisiSGT * Math.sqrt(3);
    }

    // Metode untuk menampilkan informasi titik dan sisi segitiga ke layar.
    @Override
    void tampil() {
        // Memanggil metode tampil() dari kelas induk (Titik) untuk menampilkan koordinat titik.
        super.tampil();
        // Menampilkan panjang sisi segitiga ke layar.
        System.out.println("Sisi Segitiga \t: " + sisiSGT);
    }
}
