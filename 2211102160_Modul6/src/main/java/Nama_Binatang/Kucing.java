/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nama_Binatang;
//Fatimah Az Zahra_2211102160_IF10K

public class Kucing extends Binatang { //child binatang atau turunan

    Kucing(String nama) { //pemanggilan kelas abstrak
        super("Kucing");
        this.nama = nama;
    }

    public void suara() { //metode suara
        System.out.println("mengeong");
    }

    public String toString() {
        return super.toString() + " " + nama;//pengembalian nilai polimorfism
    }
    private String nama;
}
