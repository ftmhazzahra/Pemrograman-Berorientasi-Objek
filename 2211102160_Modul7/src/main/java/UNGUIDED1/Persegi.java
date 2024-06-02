/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K
// Deklarasi kelas Persegi yang merupakan turunan dari kelas Titik.
class Persegi extends Titik {
    // Variabel untuk menyimpan panjang sisi persegi.
    double sisiPSG;

    // Konstruktor kelas Persegi, menerima koordinat dua titik untuk menghitung sisi persegi.
    Persegi(double x1, double y1, double x2, double y2) {
        // Memanggil konstruktor kelas induk (Titik) dengan koordinat titik pertama (x1, y1).
        super(x1, y1);
        // Menghitung sisi persegi
        this.sisiPSG = super.hitungJarak(new Titik(x2, y2));
    }

    // Metode untuk menghitung luas persegi.
    double hitungLuas() {
        // Menggunakan rumus luas persegi: luas = sisi * sisi.
        return (sisiPSG * sisiPSG);
    }

    // Metode untuk menampilkan informasi titik dan sisi persegi ke layar.
    @Override
    void tampil() {
        // Memanggil metode tampil() dari kelas induk (Titik) untuk menampilkan koordinat titik.
        super.tampil();
        // Menampilkan panjang sisi persegi ke layar.
        System.out.println("Sisi Persegi \t: " + sisiPSG);
    }
}