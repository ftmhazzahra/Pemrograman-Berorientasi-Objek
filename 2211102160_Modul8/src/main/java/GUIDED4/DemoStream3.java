/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED4;
//Fatimah Az Zahra-2211102160-IF10K

import java.io.*;

public class DemoStream3 {

    public static void main(String[] args) throws IOException {
        char data; //character stream
        String str = "";
        BufferedReader buff
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ketik : ");
        data = (char) buff.read();
        while (data != '\n') { //'\n' artinya selesai, kalau r read aja
            str += data;
            data = (char) buff.read();
        } //GA ADA END '\r'
        System.out.println("Yang diketik : " + str);
        System.out.println("Program Selesai");
    }
}
