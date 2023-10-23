
package day15gajibersih;

import java.util.Scanner;

public class Day15GajiBersih {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in );
        
         int gaji_bersih;
        
        System.out.print("Masukkan penghasilan anda: Rp.");
        int penghasilan = input.nextInt();
        
        if(penghasilan<1000000){
            gaji_bersih = penghasilan;
            System.out.println("Tidak ada pajak");
            System.out.println("Gaji bersih yang anda terima adalah: Rp." + penghasilan);
        }else if (penghasilan >= 1000000 && penghasilan < 2000000){
            System.out.println("5% pajak");
            gaji_bersih = penghasilan -(5*penghasilan/100);
            System.out.println("Gaji bersih yang anda terima adalah: Rp." + gaji_bersih);
        } else if  (penghasilan >= 2000000 && penghasilan < 3000000){
            System.out.println("Pajak 10%");
            gaji_bersih = penghasilan - (10*penghasilan/100);
            System.out.println("Gaji bersih yang anda terima adalah: Rp." + gaji_bersih);
        }     
    }
    
}
