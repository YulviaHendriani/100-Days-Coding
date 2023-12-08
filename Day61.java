
package day61;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan batas: ");
        int batas = input.nextInt();
        
        if (batas == 3){
            System.out.println("Kosong");
        }
        for (int i=4; i<=batas; i++){
            if (i%2==0){
                System.out.println(i+" ");
            }
        }
    }
    
}
