/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;

//Fatimah Az Zahra_2211102160_If10K
public class Circle extends Point {
    private float radius;

    // Konstruktor Circle
    public Circle(float r, float a, float b) {
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle dijalankan");
    }

    // Method cetakPoint untuk mencetak informasi titik dan radius lingkaran
    public void cetakPoint() {
        super.cekPoint(); // Memanggil method cekPoint dari superclass Point
        System.out.println("Radius: " + radius);
    }
}

