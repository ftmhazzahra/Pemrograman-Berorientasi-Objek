/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;
//Fatimah Az Zahra_2211102160_IF10K
public abstract class Employee {
    private String name;
    private String nip;

    // Konstruktor untuk inisialisasi atribut nama dan NIP
    public Employee(String name, String nip) {
        this.name = name;
        this.nip = nip;
    }

    // Method untuk mendapatkan nama pegawai
    public String getName() {
        return name;
    }

    // Method untuk mendapatkan NIP pegawai
    public String getNip() {
        return nip;
    }

    // Method abstrak untuk menghitung gaji pegawai
    public abstract double calculatePay();

    // Method abstrak untuk menampilkan informasi pegawai
    public abstract void displayInfo();
}
