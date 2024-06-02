/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K
// Deklarasi kelas Limas.
class Limas {
    // Variabel untuk menyimpan objek segitiga dan persegi.
    SgtSamaSisi segitiga;
    Persegi persegi;

    // Konstruktor kelas Limas, menerima koordinat untuk dua titik segitiga dan dua titik persegi.
    Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Px2, double Py2) {
        // Membuat objek segitiga dengan menggunakan konstruktor kelas SgtSamaSisi.
        segitiga = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        // Membuat objek persegi dengan menggunakan konstruktor kelas Persegi.
        persegi = new Persegi(Px1, Py2, Px2, Py2);
    }

    // Metode untuk menghitung luas limas.
    double hitungLuas() {
        // Menghitung luas segitiga dari objek segitiga.
        double luasSegitiga = segitiga.hitungLuas();
        // Menghitung luas persegi dari objek persegi.
        double luasPersegi = persegi.hitungLuas();
        // Menggunakan rumus luas limas: 4 * luas segitiga + luas persegi.
        return (4 * luasSegitiga) + luasPersegi;
    }

    // Metode untuk menampilkan informasi segitiga, persegi, dan luas limas ke layar.
    void tampil() {
        // Menampilkan header dan data segitiga.
        System.out.println("== DATA Segitiga ==");
        segitiga.tampil();
        System.out.printf("Luas Segitiga \t: %.7f%n%n", segitiga.hitungLuas());
        // Menampilkan header dan data persegi.
        System.out.println("== DATA Persegi ==");
        persegi.tampil();
        System.out.printf("Luas Persegi \t: %.7f%n%n", persegi.hitungLuas());
        // Menampilkan luas limas.
        System.out.printf("Luas Limas \t: %.7f%n", hitungLuas());
    }
}
