/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
public class Main {
    public static void main(String[] args) {
        MiniBus mb = new MiniBus("F 4T1M 4H", "Lexus LM 300h", 1000f, "Anti-lock Braking System , "
                + "Electronic Brakeforce Distribution , Brake Assist , Vehicle Stability Control dan tujuh airbag ", 
                3456, "luxury saloon with a large space", 7, 10, "Pribadi");
        mb.tampilInfo();
        System.out.println("Total Pajak: Rp" + mb.hitungPajak());
    }
}