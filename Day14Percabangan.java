
package day14percabangan;

import java.util.Scanner;

public class Day14Percabangan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Kamu:");
        String nama= input.nextLine();
        System.out.print("Masukkan NIM Kamu:");
        String nim= input.nextLine();
        
        if(nama.equalsIgnoreCase("Yulvia" )&& (nim.equalsIgnoreCase("D0223301"))){
            System.out.println("kelas Informatika A");
        }else{
            System.out.println("Kelas informatika yang lain"); 
            
        }
    }
    
}
