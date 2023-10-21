
package day13menentukandiskon;

import java.util.Scanner;

public class Day13MenentukanDiskon {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Total Belanja Anda: Rp.");
        int total_belanja = input.nextInt();
        
        if (total_belanja <50000){
        System.out.println("Anda Tidak Mendapatkan Diskon");
        }else if (total_belanja >= 50000 && total_belanja < 60000){
        System.out.println("Anda Menendapatkan Diskon 20%");
        int diskon= 20*total_belanja/100;
        int jumlah_bayar= total_belanja-diskon;
        System.out.println("Yang harus anda bayar adalah: Rp." + jumlah_bayar );
        }else if(total_belanja >=60000 && total_belanja <= 70000){
        System.out.println("Anda mendapatkan Diskon 30%");
        int diskon = 30*total_belanja/100;
        int jumlah_bayar = total_belanja-diskon; 
        System.out.println("Yang harus anda bayar adalah: Rp." + jumlah_bayar );
    }
  } 
}
