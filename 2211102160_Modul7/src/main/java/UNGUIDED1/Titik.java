/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K

class Titik {
    // Variabel anggota kelas untuk menyimpan koordinat titik.
    double x, y;
    
    // Konstruktor untuk kelas Titik, menerima koordinat x dan y sebagai parameter.    
    Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Metode untuk menampilkan koordinat titik ke layar.
    void tampil() {
        System.out.println("Point \t\t: [" + x + ", " + y + "]");
    }

    double hitungJarak(Titik t2) {
        return Math.sqrt(Math.pow((t2.x - x), 2) + Math.pow((t2.y - y), 2));
    }
}
