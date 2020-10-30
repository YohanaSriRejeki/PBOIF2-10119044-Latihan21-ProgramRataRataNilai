/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan21.programrataratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan rata-rata nilai mahasiswa 
 * dengan perulangan
 */

public class PBOIF210119044Latihan21ProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mahasiswa,i;
        float jumlah,nilai;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = input.nextInt();
        
        //inisialisasi
        jumlah=0;
        i=1;
        
        while(i<=mahasiswa){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = input.nextFloat();
            jumlah += nilai;
            i++;
        }
        
        
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+hitungRataRata(jumlah,mahasiswa));
        System.out.println("Developed by : Yohana Sri Rejeki");
        
    }
    //Method dengan nilai balik untuk menghitung rata-rata
    public static float hitungRataRata(float jumlah, int mahasiswa){
        float rata = jumlah/mahasiswa;
        return rata;
}
}
