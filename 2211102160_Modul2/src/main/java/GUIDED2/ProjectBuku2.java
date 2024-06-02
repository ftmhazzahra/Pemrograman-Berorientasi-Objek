/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;

//Nama: Fatimah Az Zahra - 2211102160 - IF10K - 
public class ProjectBuku2 {
    private String judul; //deklarasi variabel
    private String pengarang;
    
    public ProjectBuku2(){ 
        //membuat constructur
        //pemunculan pertama(tanpa input)
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";   
    }
    //Tanpa parameter-> get default akan kosong
    //pakai parameter-> bisa diinput data
    public ProjectBuku2 (String judul, String pengarang){
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    void cetakKeLayar() {
        if(judul==null && pengarang == null)
            return;
        //cetak pemanggilan
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
    }
}
