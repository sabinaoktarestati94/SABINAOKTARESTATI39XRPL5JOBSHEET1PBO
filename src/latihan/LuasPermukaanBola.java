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
public class LuasPermukaanBola {
     public static void main(String[] args){
         Scanner masukan = new Scanner(System.in);
         System.out.print(" Masukkan nilai jari-jari: ");
        double pi = 3.14;
        double r = masukan.nextInt();
        System.out.println(" ================================ ");
        System.out.println(" Menghitung Luas Permukaan Lingkaran: ");
        System.out.println(" ================================ ");
        System.out.println(" Luas Permukaan Lingkaran= "+((4*pi*r*r)));
}
}