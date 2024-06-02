/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
class CD {
    //define the variables
    String ukuran;
    long hargaCD;
    
    //Konstruktor untuk menginisialisasi atribut CD
    public CD (String ukuran, long hargaCD){
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }
    
    //Metode untuk  mendapatkan harga CD
    public long getHargaCD() {
        return hargaCD;
    }

    // Metode untuk mencetak detail CD
    public void cetakCD() {
        System.out.println("Ukuran CD : " + ukuran);
        System.out.println("Harga CD : Rp " + hargaCD);
        System.out.println();
    }
    
}