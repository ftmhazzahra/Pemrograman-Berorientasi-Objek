/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
// Fatimah Az Zahra_2211102160_IF10K
// Kelas utama Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek pegawai
        Satpam satpam = new Satpam("0042", "Rendra", "Jl. Itik 15", 2000, 3000000, 5); 
        Sales sales = new Sales("0185", "Wibisana", "Jl. Ayam 78", 2006, 5000000, 10); 
        Manajer manajer = new Manajer("0005", "Adi", "Jl. Angsa 56", 1999, 15000000, "Keuangan"); 

        // Menampilkan informasi pegawai
        System.out.println("== DISPLAY DATA KARYAWAN ==");
        System.out.println("Satpam:");
        satpam.displayInfo();
        System.out.println();
        System.out.println("Sales:");
        sales.displayInfo();
        System.out.println();
        System.out.println("Manajer:");
        manajer.displayInfo();
    }
}
