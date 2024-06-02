/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED2;

//Fatimah Az Zahra - 2211102160 - IF-10-K
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        int pilihan;
        do {
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN : ");
            pilihan = input.nextInt();   
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai x titik 1: ");
                    int x1 = input.nextInt();
                    System.out.print("Masukkan nilai y titik 1: ");
                    int y1 = input.nextInt();
                    titik1.inisialisasiTitik(x1, y1);
                    System.out.print("Masukkan nilai x titik 2: ");
                    int x2 = input.nextInt();
                    System.out.print("Masukkan nilai y titik 2: ");
                    int y2 = input.nextInt();
                    titik2.inisialisasiTitik(x2, y2);
                    break;
                case 2:
                    System.out.println("Titik 1:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2:");
                    titik2.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan skalar: ");
                    int skalar = input.nextInt();
                    titik1.perkalianSkalar(skalar);
                    titik2.perkalianSkalar(skalar);
                    System.out.println("Titik 1 setelah dikalikan skalar:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah dikalikan skalar:");
                    titik2.tampilTitik();
                    break;
                case 4:
                    titik1.pencerminanSumbuX();
                    titik2.pencerminanSumbuX();
                    System.out.println("Titik 1 setelah dipantulkan terhadap sumbu X:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah dipantulkan terhadap sumbu X:");
                    titik2.tampilTitik();
                    break;
                case 5:
                    titik1.pencerminanSumbuY();
                    titik2.pencerminanSumbuY();
                    System.out.println("Titik 1 setelah dipantulkan terhadap sumbu Y:");
                    titik1.tampilTitik();
                    System.out.println("Titik 2 setelah dipantulkan terhadap sumbu Y:");
                    titik2.tampilTitik();
                    break;
                case 6:
                    System.out.println("Masukkan koordinat Titik kedua:");
                    System.out.print("x: ");
                    int x = input.nextInt();
                    System.out.print("y: ");
                    int y = input.nextInt();
                    Titik t2 = new Titik();
                    t2.inisialisasiTitik(x, y);
                    double jarak = titik1.jarak(t2);
                    System.out.println("Jarak antara dua titik: " + jarak);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}
