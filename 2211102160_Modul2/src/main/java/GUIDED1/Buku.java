/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package GUIDED1;

//Nama: Fatimah Az Zahra - 2211102160 - IF10K
//Method
public class Buku {
    //deklarasi variable
    private String judul;//pakai private supaya hanya bisa dipakai di class buku saja
    private String pengarang;
    private int jumlah;
    
    public void setNilai(String judul, String pengarang, int jumlah){
        //pemanggilan variable -- merujuk parameter 
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    void cetakKeLayar(){
        //pemunculan output 
        System.out.println("Judul: " + judul);//pemanggilan variabel
        System.out.println("Pengarang:" + pengarang);
        System.out.println("Jumlah: "+ jumlah);
    }
}
