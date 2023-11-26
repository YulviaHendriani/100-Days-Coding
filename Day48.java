package day48;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        System.out.println("Masukkan awal: ");
        int awal = input.nextInt();
        System.out.println("Masukkan akhir: ");
        int akhir = input.nextInt();
        
        for(int i=awal; i<=akhir; i++){
            System.out.println(i);
        }
           
    }  
}
