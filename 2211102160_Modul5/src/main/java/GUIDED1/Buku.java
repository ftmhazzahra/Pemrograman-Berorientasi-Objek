/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
class Buku {
    String judul, pengarang;
    long hargaBuku;
    
    //Konstruktor untuk menginisialisasi atribut buku
    public Buku (String judul, String pengarang, long hargaBuku){
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }
    
    //Metode untuk mencetak detail buku
    public void cetakBuku(){
        System.out.println("\nJuduk: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Harga Buku: Rp"+hargaBuku);
    }
}