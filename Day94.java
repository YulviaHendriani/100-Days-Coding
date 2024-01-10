
package day94;

import java.util.Scanner;

public class Day94 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka1,angka2,hasil;
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2=input.nextInt();
        
        hasil=angka1+angka2;
        
        if (hasil%2==0){
            System.out.println("Hasil: "+(hasil+2));
        }else{
            System.out.println("Hasil: "+(hasil+1));
        }
    }
    
}
