
package day43;

import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
      
        Scanner x = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = x.nextInt();
        
        if (angka %2==0){
            System.out.println("Total: " + (angka+=2));
        }else if (angka %2==1){
            System.out.println("total: "+ (angka+1));
        }
        
    }
    
}
