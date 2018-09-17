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
public class KonversiSuhu {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("1. Satuan Reamur");
        System.out.println("2. Satuan Farenheit");
        System.out.println("3. Satuan Kelvin");
        System.out.print("Silakan pilih satuan: ");
        int bil = masukan.nextInt();
        double suhu = 78;
        switch (bil){
            case 1 : 
                System.out.println("Satuan Reamur= "+((suhu*4/5)));
            break;
            case 2 : 
                System.out.println("Satuan Farenheit= "+(((suhu*9/5)+32)));
            break;
            case 3 : 
                System.out.println("Satuan Kelvin= "+((suhu+273)));
        }
    }
}

