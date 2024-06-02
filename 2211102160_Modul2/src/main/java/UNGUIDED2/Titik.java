/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED2;

//Fatimah Az Zahra - 2211102160 - IF-10-K
import java.lang.Math;

public class Titik {
    private int x;
    private int y;
    // Default konstruktor
    public Titik() {
        x = 0;
        y = 0;
    }
    // Method untuk menginisialisasi titik
    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Method untuk menampilkan titik
    public void tampilTitik() {
        System.out.println("Titik: (" + x + ", " + y + ")");
    }
    // Method untuk mengalikan titik dengan skalar
    public void perkalianSkalar(int skalar) {
        x *= skalar;
        y *= skalar;
    }
    // Method untuk melakukan pencerminan terhadap sumbu X
    public void pencerminanSumbuX() {
        y = -y;
    }
    // Method untuk melakukan pencerminan terhadap sumbu Y
    public void pencerminanSumbuY() {
        x = -x;
    }
    // Method untuk mencari jarak antara dua titik
    public double jarak(Titik t2) {
        return Math.sqrt(Math.pow((t2.x - x), 2) + Math.pow((t2.y - y), 2));
    }
}
