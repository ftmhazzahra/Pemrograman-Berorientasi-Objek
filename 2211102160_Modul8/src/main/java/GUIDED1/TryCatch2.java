/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
// Fatimah Az Zahra-2211102160-IF10K
public class TryCatch2 {

    public static void main(String[] args) {
        try {
            int x = args.length; //karena ga ada nilainya otomatis program membaca x=0
            int y = 100 / x;//semua bilangan yang dibagi 0 hasilnya tidak terdefinisi
            int[] arr = {10, 11}; //ga guna jadinya karena ambigu ini x atau y
            y = arr[x]; //nampilin x tapi arr x ga diketahui
            System.out.println("Tidak terjadi exception");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exeption karena pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exeption karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
