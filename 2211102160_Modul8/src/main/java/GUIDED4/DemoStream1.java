/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED4;
//Fatimah Az Zahra-2211102160-IF10K

import java.io.*;

public class DemoStream1 {

    public static void main(String[] args) {
        byte[] data = new byte[10]; //menampilkan 10 karakter, lebih dari 10 tidak dapat ditampilkan
        System.out.print("Masukkan data : "); //input
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.print("Terjadi Exception");
        }
        System.out.print("Yang anda ketik : ");//output
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        //(char) diatas disebut posting yakni untuk mengubah format menjadi char
        }
    }
}
