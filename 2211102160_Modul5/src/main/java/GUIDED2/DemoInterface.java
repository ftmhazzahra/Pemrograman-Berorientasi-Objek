/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
//Fatimah Az Zahra-2211102160-IF10K
interface Konstanta{
    double KONST_PI = 3.14;
    String KONST_SATUAN_LUAS = " cm. persegi ";
    String KONST_SATUAN_PANJANG = " cm.";
}
public class DemoInterface implements Konstanta{
    /**Main Method*/
    public static void main(String args[]){
        System.out.println("\nPROGRAM DEMO INTERFACE");
        System.out.println("--------------------------\n");
        double radius = 10;
        System.out.println("Radius Lingkaran : "+ radius);
        System.out.println("Luas Lingkaran : "+
        (KONST_PI*radius*radius)+KONST_SATUAN_LUAS);
        System.out.println("Keliling Lingkaran: "+
        (2*KONST_PI*radius)+Konstanta.KONST_SATUAN_PANJANG);
        System.out.println();
    }
}