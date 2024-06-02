/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED2;
// Fatimah Az Zahra_2211102160_IF10K
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args){
        Buku novel, fiksi;
        novel = new Buku();
        fiksi = new Buku();
        System.out.println();
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        try{
        System.out.print("Masukan Judul Buku: ");
        novel.setJudul (br.readLine().toString());
        System.out.print("Masukan Pengarang: ");
        novel.setPengarang (br.readLine().toString());
        novel.setInfo (0.2f, 45000);
        System.out.print("Masukan Jumlah Halaman: ");
        novel.setJmlhHalaman (Integer.parseInt(br.readLine().toString()));
        novel.cetak();
        System.out.println("");
        
        System.out.print("Masukan Judul Buku: ");
        fiksi.setJudul (br.readLine().toString());
        System.out.print("Masukan Pengarang: ");
        fiksi.setPengarang (br.readLine().toString());
        fiksi.setInfo(79000);
        System.out.print("Masukan Jumlah Halaman: ");
        fiksi.setJmlhHalaman (Integer.parseInt(br.readLine().toString()));
        fiksi.cetak();
    } catch (Exception ex){
            System.out.println("Ex");
        }
    }
}
