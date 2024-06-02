/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;
//Fatimah Az Zahra_2211102160_IF10K

public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double totalSales;

    // Konstruktor dengan argumen sesuai dengan deskripsi
    public CommissionEmployee(String name, String nip, double baseSalary, double commissionRate, double totalSales) {
        super(name, nip); // Memanggil konstruktor kelas induk (Employee)
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    // Override method calculatePay untuk menghitung gaji pegawai
    @Override
    public double calculatePay() {
        // Gaji Commission Employee = Gaji pokok + (komisi * total penjualan)
        return baseSalary + (commissionRate * totalSales); 
    }

    // Override method displayInfo untuk menampilkan informasi pegawai
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName()); // Menggunakan method getName() dari kelas Employee
        System.out.println("NIP: " + getNip()); // Menggunakan method getNip() dari kelas Employee
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Total Sales: " + totalSales);
    }
}
