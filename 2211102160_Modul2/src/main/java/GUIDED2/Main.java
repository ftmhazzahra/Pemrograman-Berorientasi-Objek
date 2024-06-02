/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;

//Nama: Fatimah Az Zahra - 2211102160 - IF10K- Konstruktor

import GUIDED1.Buku;

public class Main {
    public static void main(String[] args) {
        //inisialisasi pemanggilan
        ProjectBuku2 a,b;
        //memanggil inputan dengan variabel
        a = new ProjectBuku2("Matahari", "Tere Liye");
        b = new ProjectBuku2();
        //hasil output
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
