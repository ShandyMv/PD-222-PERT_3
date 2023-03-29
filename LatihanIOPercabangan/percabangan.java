package LatihanIOPercabangan;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //if-else
        //cek syarat pembuatan KTP
        int usia = 0;
        System.out.print("Masukkan usia anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Sudah memenuhi syarat");
        } else {
            System.out.println("Belum memenuhi Syarat");
        }

        //if-else-if
        //cek status kelulusan MK berdasarkan nim dan nilai UAS
        String nim;
        int nilaiUAS;
        System.out.print("Masukkan nim anda: ");
        nim = br.readLine();
        System.out.print("Masukkan nilai UAS anda: ");
        nilaiUAS = Integer.parseInt(br.readLine());

        //jika nilai 80, 70, 65 = LULUS, di bawah 65 TIDAK LULUS
        if (nim.equalsIgnoreCase("22410100058")
                && nilaiUAS == 80) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100058")
                && nilaiUAS == 70) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("2240100058")
                && nilaiUAS == 65) {
            System.out.println ("LULUS");
        } else if (nim.equalsIgnoreCase("22410100058") && nilaiUAS < 65) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("NILAI KOSONG");
        }

        //equals : memperhatikan detil besa-kecil hurufnya (case sensitive)
        //equalsIgnoareCase : non-sensitive

        //nested if:
        //cek menu yang di pilih (makanan/minuman)
        //
        //

        String menu, jenis;
        System.out.print("Masukkan menu (Makanan/Minuman)");
        menu = br.readLine();
        System.out.print("Masukkan jenis menu \n Makanan: Snack,Nasi bungkus \n" + "Minuman: Kopi, teh, air mineral. Pilih: ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("Makanan")){
            if (jenis.equalsIgnoreCase("snack")){
                System.out.println("harga 2500");
            } else if (jenis.equalsIgnoreCase("Nasi Bungkus")) {
                System.out.println("harga 7000");
            }
        } else if (menu.equalsIgnoreCase("Minuman")){
            if (jenis.equalsIgnoreCase("kopi")){
                System.out.println("harga 3000");
            } else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("harga 2000");
            } else if (jenis.equalsIgnoreCase("air mineral")) {
                System.out.println("harga 1000");
            }
        }

    }

}
