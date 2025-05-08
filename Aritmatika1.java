/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aritmatika1;

import java.util.Scanner;

/**
 *
 * @author MSI GF63
 */
public class Aritmatika1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            do{
        
                System.out.println("Menu:");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Keluar");
                System.out.println("Pilihlah 1-5: ");
                pilihan = scanner.nextInt();
                
                switch(pilihan){
                    case 1 -> {
                        System.out.println("Masukan dua angka");
                        int a1 = scanner.nextInt();
                        int a2 = scanner.nextInt();
                        System.out.println("Hasil dari: " + ( a1 + a2 ));
                    }
                    case 2 -> {
                        System.out.println("Masukan dua angka");
                        int a1 = scanner.nextInt();
                        int a2 = scanner.nextInt();
                        System.out.println("Hasil dari: " + ( a1 - a2 ));
                    }
                    case 3 -> {
                        System.out.println("Masukan dua angka");
                        int a1 = scanner.nextInt();
                        int a2 = scanner.nextInt();
                        System.out.println("Hasil dari: " + ( a1 * a2 ));
                    }
                    case 4 -> {
                        System.out.println("Masukan dua angka (double)" );
                        double a3 = scanner.nextDouble();
                        double a4 = scanner.nextDouble();
                        if (a4 !=0) {
                            System.out.println("Hasil dari: " + (a3 / a4));
                        }else {
                            System.out.println("Pembagian dengan nol tidak diperbolehkan");
                        }
                    }
                    case 5 -> System.out.println("Keluar Dari Program");
                    default -> System.out.println("Pilihan tidak valid ");
                }
                System.out.println();
            }while (pilihan !=5);
        }
   }
}
    

