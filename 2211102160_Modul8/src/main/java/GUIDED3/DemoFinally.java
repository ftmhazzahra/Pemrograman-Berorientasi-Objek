/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED3;
//Fatimah Az Zahra-2211102160-IF10K

public class DemoFinally {

    public static void main(String[] args) {
        int x = 3;//urutan indeks ke 3
        int[] arr = {10, 11, 12}; //array mulai dari 0
        try{
            System.out.println(arr[x]);
            System.out.println("Tidak terjadi exception");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception");
            System.out.println("indeks diluar batas: " + e.getMessage());
        }finally {
            System.out.println("Program Selesai");
        }
    }
}