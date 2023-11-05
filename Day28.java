
package day28;

import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai kamu:");
        int nilai = input.nextInt();
        
        if(nilai >= 80){
            System.out.println("Nilai kamu bagus");
        }else{
            System.out.println("Nilai kamu kurang bagus");
        }
    }
    
}
