
package day58;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.print("Masukkan nama: ");
            String nama = input.next();
           
            if (nama.equalsIgnoreCase("Yulvia")){
                System.out.println("Program berhenti");
                break;
            }
        }
    }
    
}
