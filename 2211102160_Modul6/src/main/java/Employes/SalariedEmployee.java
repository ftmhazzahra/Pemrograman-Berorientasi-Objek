/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;
//Fatimah Az Zahra_2211102160_IF10K
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Konstruktor untuk inisialisasi atribut nama, NIP, dan upah mingguan
    public SalariedEmployee(String name, String nip, double weeklySalary) {
        super(name, nip); // Memanggil konstruktor kelas induk (Employee)
        this.weeklySalary = weeklySalary;
    }

    // Implementasi method untuk menghitung gaji pegawai
    @Override
    public double calculatePay() {
        return weeklySalary; // Gaji Salaried Employee sama dengan upah mingguan
    }

    // Implementasi method untuk menampilkan informasi pegawai
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("NIP: " + getNip());
        System.out.println("Weekly Salary: " + weeklySalary);
    }
}