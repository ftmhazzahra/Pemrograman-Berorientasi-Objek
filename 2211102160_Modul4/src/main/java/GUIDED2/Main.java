/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
//Fatimah Az Zahra_2211102160_If10K
// Kelas utama yang berisi metode main
public class Main {
    public static void main(String[] arguments){
        // Membuat objek-objek
        Dog guffy = new Dog(); // Sebuah objek Dog
        Duck donald = new Duck(); // Sebuah objek Duck
        Horse lala = new Horse(); // Sebuah objek Horse
        
        // Menginisialisasi atribut nama untuk setiap objek
        guffy.name = "Guffy";
        donald.name = "Donald";
        lala.name = "Lala";
        
        // Menampilkan suara dan nama hewan-hewan
        System.out.println("First we'll get the dog to speak: ");
        guffy.speak(); // Dog bersuara
        System.out.println(" ");
        
        System.out.println("Now, the duck will speak: ");
        donald.speak(); // Duck bersuara
        System.out.println(" ");
        
        System.out.println("Now, the horse will speak: ");
        lala.speak(); // Horse bersuara
        System.out.println(" ");
        
        // Memanggil metode sleep untuk menunjukkan polimorfisme
        guffy.sleep(); // Dog tidur
        donald.sleep(); // Duck tidur
        lala.sleep(); // Kuda tidur
    }
}
