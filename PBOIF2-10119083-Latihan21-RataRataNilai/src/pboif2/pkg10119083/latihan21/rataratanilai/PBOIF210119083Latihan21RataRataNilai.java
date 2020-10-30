/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan Rata Rata Nilai
 */
public class PBOIF210119083Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner (System.in);
        int i, n;
        float jum, x, rata;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
            System.out.print ("Nilai Mahasiswa ke-"+i+": ");
            x=masuk.nextFloat ();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Maka,Rata-rata Nilainya adalah: "+ rata);
        System.out.println("====================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");

    }
    
}
