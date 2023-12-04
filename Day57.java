
package day57;

import java.util.Scanner;

public class Day57 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
          while(true){
            System.out.print("Masukkan angka genap: ");
            int angka = input.nextInt();
            
            if (angka %2==0){
                System.out.println("Masukkan genap");
            }else{
                System.out.println("anda memasukkan bilangan ganjil program berhenti");
                break;
            }
            
        }
    }
    
}
