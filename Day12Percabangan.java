
package day12percabangan;

import java.util.Scanner;

public class Day12Percabangan {

    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        
        //Menghitung Jumlah Pertemuan Yang diikuti dalam 16 pertemuan untuk menentukan Mengulang Atau Tidak
        
        System.out.print("Masukkan Jumlah Pertemuan Yang Anda ikuti: ");
        int jumlah_pertemuan = input.nextInt();
        
        if (jumlah_pertemuan >= 9 && jumlah_pertemuan <= 16){
            System.out.println("Anda Tidak Perlu Mengulang");
        }else if(jumlah_pertemuan<9){
            System.out.println("Anda Harus Mengulang Tahun Depan");
        }else if(jumlah_pertemuan >16){
            System.out.println("Anda Tidak Bisa Memasukkan Angka Yang Lebih dari 16");
        }
    }
    
}
