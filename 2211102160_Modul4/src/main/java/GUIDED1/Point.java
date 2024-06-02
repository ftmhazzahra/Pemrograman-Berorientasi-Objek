/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;

//Fatimah Az Zahra_2211102160_IF10K
public class Point {
    //deklarasi atribut
    protected float x, y;

    // Konstruktor Point
    public Point(float a, float b) {
        System.out.println("Konstruktor dijalankan");
        x = a;
        y = b;
    }

    //Membuat method cekPoint
    public void cekPoint() {
        System.out.println("Poin: [" + x + ", " + y + "]");
    }
}
