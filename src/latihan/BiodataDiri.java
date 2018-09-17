/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BiodataDiri {
    public static void main(String[] args) {
        String nama, tempatlahir, jeniskelamin, alamat, motto;
        int NIS, tanggallahir, absen;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("DATA SISWA SMK TELKOM MALANG");
        System.out.print("Nama Siswa: ");
        nama = keyboard.next();
        System.out.print("NIS: ");
        NIS = keyboard.nextInt();
        System.out.print("Tempat Lahir: ");
        tempatlahir = keyboard.next();
        System.out.print("Tanggal Lahir: ");
        tanggallahir = keyboard.nextInt();
        System.out.print("Jenis Kelamin: ");
        jeniskelamin = keyboard.next();
        System.out.print("Alamat di Malang: ");
        alamat = keyboard.next();
        System.out.print("Motto Hidup: ");
        motto = keyboard.next();
        System.out.println("--------------------------------------------");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("NIS: " + NIS);
        System.out.println("Tempat Lahir: " + tempatlahir);
        System.out.println("Tanggal lahir: " + tanggallahir);
        System.out.println("Jeniskelamin: " + jeniskelamin);
        System.out.println("Alamat di Malang: " + alamat);
        System.out.println("Motto: " + motto);
}
}
