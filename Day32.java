
package day32;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
         int hasil = 0; 
        System.out.print("Masukkan nilai (A): ");
        int A = input.nextInt();
        
        System.out.print("Masukkan nilai (B): ");
        int B = input.nextInt();

      
        for (int i = A; i <= B; i++) {
            hasil += i;
        }

        System.out.print(A + " + ");
        for (int i = A + 1; i < B; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(B + " = " + hasil);
    }
    
}
