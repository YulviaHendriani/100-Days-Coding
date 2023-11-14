
package day37;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner  input = new Scanner (System.in);
        
        System.out.println("Masukkan angka:");
        int angka = input.nextInt();
        
        if (angka>0){
            System.out.println(angka+" Adalah bilangan positif");
        }else if(angka<0){
            System.out.println(angka+" Adalah bilangan negatif");
        }else{
            System.out.println("Angka nol");
        }
            
        
        
       
       
    }
    
}
