
package day31;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama: ");
          String nama = input.nextLine();
          
          System.out.print("Masukkan NIM: ");
          String nim = input.nextLine();
          
          System.out.println("Pilihan : \n 1. PWK  \n 2. Teknik Sipil \n 3. Teknik Informatika \n" );
          
          System.out.print("Masukkan pilihan:");
          int pilihan = input.nextInt();
          
          if(pilihan == 1){
              System.out.println(nama+" dengan NIM "+nim+" mahasiswa prodi PWK");
          }else if (pilihan == 2 ){
              System.out.println(nama+" dengan NIM "+nim+" mahasiswa prodi Teknik Sipil");
          }else if (pilihan == 3){ 
              System.out.println(nama+" dengan NIM "+nim+" mahasiswa prodi Teknik Informatika");
          }
    }
    
}
