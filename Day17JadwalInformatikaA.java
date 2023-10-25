
package day17jadwalinformatikaa;

import java.util.Scanner;

public class Day17JadwalInformatikaA {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Hari Untuk Menampilkan Mata Kuliah:");
        String hari = input.nextLine();
         
        if (hari.equalsIgnoreCase("Selasa")){
        System.out.println("Mata kuliah"+"\n" + "Dasar-Dasar Pemograman"+"\n"+"pendidikan pancasila"+"\n"+"Matematika");
        }else if(hari.equalsIgnoreCase("Rabu")){
        System.out.println("Mata kuliah"+"\n"+"Fisika Elektronika"+"\n"+"Pengantar Sistem Teknologi dan informasi"+"\n"+"Bahasa Indonesia");
        }else if (hari.equalsIgnoreCase("Kamis")){
        System.out.println("Mata kuliah"+"\n"+"Pendidikan Agama Islam"+"\n"+"Pendidikan Kewarganegaraan");   
        }else if (hari.equalsIgnoreCase("Jumat")){
        System.out.println("Mata kuliah"+"\n"+"Pendidikan Agama Protestan");
        }else{
        System.out.println("Tidak Ada Mata Kuliah");
        }
    }
    
}
