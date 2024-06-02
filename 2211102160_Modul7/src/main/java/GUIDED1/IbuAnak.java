/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra_2211102160_IF10K
//kelas main dari manusia
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia("Budi", 30);
        Manusia anak1 = new Manusia("Ani", 4);
        Manusia ibu2 = new Manusia("Diana", 40);
        Manusia anak2 = new Manusia("Andi", 5, ibu2);
        //Relasi antara Manusia dengan Manusia
        System.out.println("=========================\n");
        //hanya cetak
        ibu1.cetak();
        anak1.cetak();
        System.out.println("=========================\n");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        System.out.println("=========================\n");
        ibu2.cetak();
        anak2.cetak();
    }
}
