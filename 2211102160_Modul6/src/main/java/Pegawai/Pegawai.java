/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pegawai;
//Fatimah Az Zahra_2211102160_IF10K
public abstract class Pegawai {

    private String namaPeg;

    public Pegawai(String nama) { //metode untuk nama
        namaPeg = nama;
    }

    public String namaPegawai() { //metode untuk mengembalikan nama pegawai
        return namaPeg;
    }
    public abstract double income(); //polimorfism
}
