
package day76;

import java.util.Scanner;

public class Day76 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Batas: ");
        int batas = input.nextInt();
        
        if(batas%3==0||batas%5==0){
            System.out.println("Y");
        }else{
        System.out.println("H");
    }
    }
    
}
