/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
/** Kelas ChildCD merupakan turunan dari CD dan mengimplementasikan interface InterfaceCD */
class ChildCD extends CD implements InterfaceCD {
    //konstruktor untu menginisialisasi atribut CD
    public ChildCD(String ukuran, long hargaCD) {
        super(ukuran, hargaCD);
    }
}