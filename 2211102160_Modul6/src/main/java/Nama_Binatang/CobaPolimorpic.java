/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nama_Binatang;
//Fatimah Az Zahra_2211102160_IF10K

import java.util.Random;

public class CobaPolimorpic {

    public static void main(String[] args) {
        Binatang[] peliharaanku = {new Burung("Kakak Tua"),
            new Kambing("Etawa"),
            new Anjing("Kintamani"),
            new Kucing("Anggora")};

        Binatang kesayangan;
        Random pilihan = new Random();//memilih secara acak
        
        //random
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)]; //mengacak bilangan dari 0 sampai length-1 atau (i-1).
        System.out.println(
        "Binatang Kesayangan anda: "+kesayangan);
        System.out.print("Suaranya: ");
        kesayangan.suara(); //diambil dari kelas induk
    }
}
