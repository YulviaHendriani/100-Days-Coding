
package day33;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        
         System.out.print("Masukkan nilai (A): ");
        int A = input.nextInt();
        
        System.out.print("Masukkan nilai (B): ");
        int B = input.nextInt();
        
        int hasil = A*B;
        
      if (hasil > 5){
          System.out.println("Hasil akhir adalah: "+(hasil -=3));
      }else if (hasil < 5){
        System.out.println("Hasil akhir adalah: "+(hasil +=3));
      }
    }
    
}
