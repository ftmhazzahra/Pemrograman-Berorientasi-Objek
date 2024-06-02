/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
//Fatimah Az Zahra_2211102160_IF10K
public class Buku {
    //inisialisasi atribut
    private String pengarang;
    private String judul;
    private int jmlh_Halaman;
    private float diskon;
    private double harga;
    
    public Buku(){
        System.out.println("Konstruktor Buku dijalankan...");
    }
    
    public void setPengarang (String Pengarang){
        pengarang = Pengarang;
    }
    
    public void setJudul (String Judul){
        judul = Judul;
    }
    
    public void setJmlhHalaman (int JmlhHalaman){
        jmlh_Halaman = JmlhHalaman;
    }
    
    public String getPengarang(){
        return pengarang;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public int getJmlhHalaman(){
        return jmlh_Halaman;
    }
    
    //method overloading untuk mengatur buku diskon dan harga
    public void setInfo(float dskn, double HargaBuku){
        diskon = dskn;
        harga = HargaBuku;
    }
    
    public void setInfo(double HargaBuku){
        diskon = 0.1F; //float jadi define pake karakter F
        harga = HargaBuku - (HargaBuku * diskon);
    }
    
    public void cetak(){
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Pengarang Buku: " + getPengarang());
        System.out.println("Jumlah Halaman Buku: " + getJmlhHalaman());
        System.out.println("Diskon Buku: " + diskon);
        System.out.println("Harga Buku: " + harga);
        System.out.println("");
    }
}
