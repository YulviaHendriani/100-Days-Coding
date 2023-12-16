
package day68;

import java.util.Scanner;

public class Day68 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,hasil=0;
        
        System.out.print("Masukkan nilai A :");
        A=in.nextInt();
        System.out.print("Masukkan nilai B :");
        B=in.nextInt();
        
        System.out.println("\n Output :");

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
