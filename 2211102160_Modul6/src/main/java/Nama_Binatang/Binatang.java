/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nama_Binatang;
//Fatimah Az Zahra_2211102160_IF10K
public abstract class Binatang {
    private String jenis;
    
    //constructor
    Binatang (String jenis){
        this.jenis = jenis;
    }
    
    //deklarasi metode
    protected abstract void suara();
    
    //pemanggilan polimorfism
    public String toString(){
        return "Seekor " + jenis;
    }
}
