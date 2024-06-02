/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;

//Fatimah Az Zahra - 2211102160 - IF10K
public class Main {
    public static void main (String[] args){
        int x, y;
        Bilangan bil = new Bilangan (10, 20);
        
        x= 15;
        y= 30;
        
        System.out.println("Nilai X dan Y sebelum passed by value: ");
        System.out.println("Nilai X: " + x);
        System.out.println("Nilai Y: " + y);
        
        bil.operasi_pass_by_value(x, y);
        
        System.out.println("Nilai X dan Y Setelah passed by value: ");
        System.out.println("Nilai X: " + x);
        System.out.println("Nilai Y: " + y);
        
        System.out.println("\nNilai bil.a dan bil.b sebelum passed by reference: ");
        bil.tampil();
        
        bil.operasi_pass_by_reference(bil);
        
        System.out.println("\nNilai bil.a dan bil.b setelah passed by reference: ");
        bil.tampil();
    }
}
