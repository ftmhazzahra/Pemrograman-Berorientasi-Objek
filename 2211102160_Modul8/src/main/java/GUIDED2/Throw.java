/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
//Fatimah Az Zahra-2211102160-IF10K

public class Throw {

    public static void methodLain() {
        try {
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e) { // e bisa diganti apapun, disesuaikan aja
            System.out.println("Penanganan exception dalam method methodLain()");
            throw e;
        }
    }
//metode yang ada kemungkinan error di main di lempar ke try catch
    public static void main(String[] args) {
        try {
            methodLain();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception dalam method main()");
        }
    }
}
