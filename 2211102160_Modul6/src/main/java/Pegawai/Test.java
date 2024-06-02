/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pegawai;
//Fatimah Az Zahra_2211102160_IF10K
import java.text.DecimalFormat;
public class Test {

    public static void main(String args[]) {
        Pegawai pgw;
        
        //Membuat objek referensi dari kelas abstrak //Pegawai
        String output = "";
        Direktur d = new Direktur("Fatimah", 12000000.00, 7500000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        pgw = d;
        
        /*objek referensi dari kelas abstrak pegawai (pgw) merefer objek
        dari kelas Direktur (d) yang diturunkan dari kelas abstrak
        pegawai */
        System.out.println("\nDEMO INHERITANS, ENKAPSULASI,POLIMORFI");
        System.out.println("-----------------------------------\n");
        // Mencetak informasi Direktur ke console
        System.out.println("Nama : " + d.namaPegawai() + "\n"
                + "Jabatan : " + d.jabatan() + "\n" + "Gaji : "
                + digitPresisi.format(d.gajiPerBulan()) + "\n"
                + "Dividen : " + digitPresisi.format(d.labaDividen()) + "\n"
                + "Total : " + digitPresisi.format(d.income()) + "\n");
        System.exit(0);
    }
}
