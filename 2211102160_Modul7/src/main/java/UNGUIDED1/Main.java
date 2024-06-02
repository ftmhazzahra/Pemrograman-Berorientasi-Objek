/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra - 2211102160 - IF10K
public class Main {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel nama dengan nilai "FATIMAH AZ AHRA".
        String nama = "FATIMAH AZ AHRA";
        // Deklarasi dan inisialisasi variabel NIM dengan nilai "2211102160".
        String NIM = "2211102160";

        // Menampilkan informasi nama ke layar.
        System.out.println("NAMA \t: " + nama); // Menampilkan nama di atas
        // Menampilkan informasi NIM ke layar.
        System.out.println("NIM \t: " + NIM);
        
        // Membuat objek Limas P dengan menggunakan konstruktor Limas.
        // Titik-titik yang digunakan untuk membentuk limas, segitiga, dan persegi.
        Limas P = new Limas(1.0, 2.0, 5.0, 2.0, 6.0, 2.0, 7.0);
        
        // metode tampil() dari objek P 
        P.tampil();
    }
}
