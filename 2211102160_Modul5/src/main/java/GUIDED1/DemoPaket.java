/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
class DemoPaket {
    public static void main(String args[]) {
        // Membuat objek Paket
        Paket a = new Paket("Pemrograman Berorientasi Objek", "Benyamin Langgu Sinaga", 60000, "700 MB", 50000);
        // Menghitung harga paket
        a.hitungHargaPaket();
        // Mencetak detail paket
        a.cetakPaket();
    }
}