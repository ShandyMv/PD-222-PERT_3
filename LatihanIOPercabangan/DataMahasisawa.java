package LatihanIOPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataMahasisawa {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String nama, nim, prodi;
        int semester, sksAmbil;

    try {
        //step5 pengerjaan logika program
        System.out.println("---- Data Mahasiswa ----");//header
        //input
        System.out.print("NIM : ");
        nim = br.readLine();
        System.out.print("Nama : ");
        nama = br.readLine();
        System.out.print("Prodi : ");
        prodi = br.readLine();
        System.out.print("Semester : ");
        semester = Integer.parseInt(br.readLine());
        System.out.print("Jumlah SKS yang diambil : ");
        sksAmbil = Integer.parseInt(br.readLine());

        //output
        System.out.println("---- Cetak Data Mahasiswa");
        System.out.println("NIM mahasiswa : " + nim);
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Prodi mahasiswa : " + prodi);
        System.out.println("Seemester mahasiswa : " + semester);
        System.out.println("Jumlah SKS mahasiswa : " + sksAmbil);

    }catch (Exception exp) {
//kondisi ada error, apa yang ditampilkan
        System.out.println(exp.getMessage());
        System.out.println("Isian semester dan sks harus angka");
    }


    }
    }

