
package day45;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan gaji: Rp.");
        double gaji = input.nextInt();
        
        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = input.next();
        
        double potongan3jt= 0.05;
        double potongan5jt= 0.10;
        double potonganpns= 0.05; 
        
        if(gaji>=5000000 && pekerjaan.equalsIgnoreCase("PNS")){
            System.out.println("Gaji bersih anda: Rp."+ (gaji-(gaji*(potongan5jt+potonganpns))));
        }else if(gaji>=3000000 && pekerjaan.equalsIgnoreCase("pns")){
        System.out.println("Gaji bersih anda: Rp."+(gaji-(gaji*(potongan3jt+potonganpns))));
        }else if(gaji>=5000000){
            System.out.println("Gaji bersih anda: Rp."+(gaji-(gaji*potongan5jt)));
        }else if (gaji>=3000000){
            System.out.println("Gaji bersih anda: Rp."+(gaji-(gaji*potongan3jt)));
        }
    }
    
}
