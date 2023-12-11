
package day64;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Angka awal: ");
        int awal= input.nextInt();
        
        System.out.println("Angka akhir: ");
        int akhir = input.nextInt();
        
        for (int i=awal; i<=akhir;i++){
            System.out.println(i);
        }
    }
    
}
