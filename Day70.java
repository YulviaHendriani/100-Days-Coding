
package day70;

import java.util.Scanner;

public class Day70 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Berapa kali kamu ingin mengulang: ");
        int a = input.nextInt();
        
        for(int b=1; b<=a; b++){
            System.out.println(b);
        }
    }
    
}
