
package day59;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        while(true){
            System.out.print("Masukkan hari: ");
            String hari=input.next();
            
            if (hari.equalsIgnoreCase("senin")){
                System.out.println("Masukkan hari lain");
                break;
            }
        }
    }
    
}
