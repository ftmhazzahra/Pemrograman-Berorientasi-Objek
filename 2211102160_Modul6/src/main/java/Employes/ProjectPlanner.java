/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;
//Fatimah Az Zahra_2211102160_IF10K

public class ProjectPlanner extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double totalProjectResults;

    // Konstruktor untuk inisialisasi atribut nama, NIP, gaji pokok, komisi, dan total hasil proyek
    public ProjectPlanner(String name, String nip, double baseSalary, double commissionRate, double totalProjectResults) {
        super(name, nip); // Memanggil konstruktor kelas induk (Employee)
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.totalProjectResults = totalProjectResults;
    }

    // Implementasi method untuk menghitung gaji pegawai
    @Override
    public double calculatePay() {
        double tax = 0.05 * baseSalary; // Menghitung pajak (5% dari gaji pokok)
        // Gaji Project Planner = Gaji pokok + (komisi * total hasil proyek) - pajak
        return baseSalary + (commissionRate * totalProjectResults) - tax; 
    }

    // Implementasi method untuk menampilkan informasi pegawai
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("NIP: " + getNip());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Total Project Results: " + totalProjectResults);
    }
}
