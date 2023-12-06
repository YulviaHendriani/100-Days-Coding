
package day60;

import java.util.Scanner;

public class Day60 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan batas: ");
        int batas = input.nextInt();
        
        for(int i=1; i<=batas ; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
    
}
