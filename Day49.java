package day49;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner  input = new Scanner (System.in);
        
        while (true){
            System.out.println("Masukkan bilangan genap: ");
            int angka = input.nextInt();
            
            if (angka %2==0){
                System.out.println("Bilangan genap");
            }else{
                System.out.println("anda memasukkan bilangan ganjil");
                break;
            }
        }
    }
    
}
