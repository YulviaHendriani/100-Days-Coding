
package day29;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama:");
        String nama = input.nextLine();
        
        if(nama.equalsIgnoreCase("Yulvia Hendriani")){
            System.out.println("NIM: D0223301");
        }else{
            System.out.println("Tidak ditemukan");
        }
    }
    
}
