
package day51;

import java.util.Scanner;

public class Day51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan kamu (1-3): ");
        int prodi = input.nextInt();
        
        switch(prodi){
            case 1:
                System.out.println("Teknik Informatika");
                break;
            case 2:
                System.out.println("Teknik Sipil");
                break;
            case 3:
                System.out.println("PWK");
                break;
            default:
                System.out.println("prodi salah");
                break;
        }
    }
    
}

               