/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNGUIDED1;
//Fatimah Az Zahra-2211102160-IF10K
public class MiniBus extends Sedan {
    private String tipe;

    public MiniBus() {}

    // Konstruktor dengan parameter yang sesuai
    public MiniBus(String noPlat, String merk, float pajak, String fasilitasKeamanan, int kapasitasCC, 
            String fasilitasKenyamanan, int kapasitasPenumpang, int kapasitasBagasi, String tipe) {
        super(noPlat, merk, pajak, fasilitasKeamanan, kapasitasCC, fasilitasKenyamanan);
        this.tipe = tipe;
    }

    // Metode untuk menampilkan informasi MiniBus
    public void infoMiniBus() {
        if (tipe.equals("Pribadi")) {
            System.out.println("Tipe MiniBus: Pribadi, digunakan sebagai kendaraan pribadi");
        } else if (tipe.equals("Wagon")) {
            System.out.println("Tipe MiniBus: Wagon, digunakan sebagai kendaraan angkut/travel");
        }
    }

    // Override metode tampilInfo() dari kelas induk (Sedan)
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        Bus bus = new Bus();
        bus.setKapasitasPenumpang(7); // contoh nilai
        bus.setKapasitasBagasi(10); // contoh nilai
        bus.infoBus();
        infoMiniBus();
    }

    // Metode untuk menghitung pajak MiniBus
    public float hitungPajak() {
        if (tipe.equals("Pribadi")) {
            return (super.hitungPajak() * 0.05f) + (super.hitungPajak() * 0.03f);
        } else if (tipe.equals("Wagon")) {
            return (super.hitungPajak() * 0.03f) + (super.hitungPajak() * 0.05f);
        }
        return 0.0f;
    }
}