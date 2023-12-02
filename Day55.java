
package day55;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka1,angka2,hasil;
        System.out.print("Masukkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2: ");
        angka2=input.nextInt();
        
        hasil=angka1+angka2;
        
        if (hasil%2==0){
            System.out.println("Hasil: "+(hasil+1));
        }else{
            System.out.println("Hasil: "+(hasil+2));
        }
    }
    
}
