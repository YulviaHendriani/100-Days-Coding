
package day47;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka= input.nextInt();
        
        if(angka<=100){
            System.out.println("Hasil: "+(angka+5));
        }else{
            System.out.println("Hasil: "+(angka-100));
        }
    } 
}
