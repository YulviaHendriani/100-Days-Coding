
package day8projectgajibersih;

import java.util.Scanner;


public class Day8Projectgajibersih {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah gaji pokok anda: Rp.");
        double gaji_pokok = input.nextDouble();
        
        System.out.print("Masukkan lama lembur (jam):");
        double  lama_lembur = input.nextDouble();
        double lembur_perjam = 55000;
        
        double gaji_bersih;
        
        System.out.println("Gaji bersih anda: Rp." + (gaji_bersih= gaji_pokok+(lama_lembur*lembur_perjam)));        
                
    }
    
}
