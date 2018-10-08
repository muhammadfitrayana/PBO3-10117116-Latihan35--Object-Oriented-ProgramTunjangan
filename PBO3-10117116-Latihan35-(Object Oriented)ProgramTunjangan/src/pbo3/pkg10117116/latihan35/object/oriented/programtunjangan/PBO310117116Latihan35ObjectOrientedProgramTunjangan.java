/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan35.object.oriented.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Tunjangan Berbasis Objek
 *  
 */
public class PBO310117116Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        hitungTunjangan gk = new hitungTunjangan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gk.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gk.status = scn.next();

        gk.HasilHitung(gk.status,gk.gajiPokok);
    }
  }
