
package day90;

import java.util.Scanner;

public class Day90 {
     public static String biodata(String nama, String nim, String prodi, char kelas){
        return "Nama: "+nama+"\nNIM: "+nim+"\nProgram Studi: "+prodi+ "\nKelas: "+ kelas;    
  }
    public static void main(String[] args) {
        Scanner y = new Scanner (System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = y.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = y.nextLine();
        
        System.out.print("Masukkan program studi: ");
        String prodi = y.nextLine();
        
        System.out.print("Masukkan kelas: ");
        char kelas = y.next().charAt(0);
        
        System.out.print(biodata(nama,nim,prodi,kelas));
        
                
       
    }
    
}
