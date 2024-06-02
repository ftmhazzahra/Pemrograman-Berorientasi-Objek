/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra_2211102160_IF10K
public class Manusia {
    //mendefinisikan atribut
    private String nama;
    private int umur;
    //mendefinisikan relasi
    private Manusia ibu;
    private Manusia anak;
    
    //kostruktor
    public Manusia() {
    }
    //konstruktor nama dan umur
    public Manusia(String nm, int umr) {
        nama = nm;
        umur = umr;
        ibu = new Manusia(); //fungsi membuat objek baru
        anak = new Manusia();
        ibu = null;//fungsi set nilai relasi (null)
        anak = null;
    }
    
    //inisialisasi untuk keluarga angkat
    public Manusia(String nm, int umr, Manusia ibu_angkat) {
        nama = nm;
        umur = umr;
        ibu = new Manusia(); //fungsi membuat objek baru
        anak = new Manusia();
        ibu = ibu_angkat;//menetapkan nilai relasi ibu_angkat sesuai parameter
        ibu_angkat.anak = this;//relasi kita atur ke objek ini
    }

    //method adopsi
    public void adopsi(Manusia anak_angkat) {
        anak = anak_angkat;//nilai relasi diatur sesuai parameter
        anak_angkat.ibu = this;//relasi kita atur ke objek ini
    }

    //method cetak
    public void cetak() {
        System.out.println("\n- Data Pribadi -");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        if (ibu != null) {
            System.out.println("Nama ibu : " + ibu.nama);
        } else if (anak != null) {
            System.out.println("Nama anak : " + anak.nama);
        }

    }
}
