
package day46;

import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Merk HP : \n 1.Vivo \n 2.Samsung \n 3.Realme");
        System.out.print("Masukkan Pilihan Kamu: ");
        int merk_HP = input.nextInt();
        
        //Harga HP
        double hargavivo = 2300000;
        double hargasamsung = 3000000;
        double hargarealme= 2800000;
        
        System.out.print("Apakah anda memiliki kartu member ? (ya/tidak): ");
        String jawaban = input.next();
        
        //Kode Diskon
        String kodevivo = "vivo1205";
        String kodesamsung ="samsung0711";
        String koderealme ="realme2008";
        
        System.out.println("jika anda tidak memiliki kartu member ketik saja: Bukanmember ");
        System.out.print("Masukkan kode member anda: ");
        String kode_member = input.next();
        
        double diskon= 0.05;
        
        if( merk_HP==1){
            if(jawaban.equalsIgnoreCase("ya" )){
                if (kode_member.equals("vivo1205")){
                    System.out.println("Selamat kamu mendapatkan diskon 5%"); 
                    System.out.println("Total yang kamu bayar: Rp."+(hargavivo-(hargavivo*diskon)));
                }else{
                    System.out.println("Masukkan kode dengan benar");
                }
            }else if(jawaban.equalsIgnoreCase("tidak")){
                System.out.println("Maaf kamu tidak mendapatkan diskon");
                System.out.println("Total yang kamu bayar: Rp."+(hargavivo));
            }                
        }else if(merk_HP==2){    
            if(jawaban.equalsIgnoreCase("ya" )){
                if (kode_member.equals("samsung0711")){
                    System.out.println("Selamat kamu mendapatkan diskon 5%"); 
                    System.out.println("Total yang kamu bayar: Rp."+(hargasamsung-(hargasamsung*diskon)));
                }else{
                    System.out.println("Masukkan kode dengan benar");
                }
            }else if(jawaban.equalsIgnoreCase("tidak")){
                System.out.println("Maaf kamu tidak mendapatkan diskon");
                System.out.println("Total yang kamu bayar: Rp."+(hargasamsung));       
            }
        }else if(merk_HP==3){
            if(jawaban.equalsIgnoreCase("ya" )){
                if (kode_member.equals("realme2008")){
                    System.out.println("Selamat kamu mendapatkan diskon 5%"); 
                    System.out.println("Total yang kamu bayar: Rp."+(hargarealme-(hargarealme*diskon)));
                }else{
                    System.out.println("Masukkan kode dengan benar");
                }
            }else if(jawaban.equalsIgnoreCase("tidak")){
                System.out.println("Maaf kamu tidak mendapatkan diskon");
                System.out.println("Total yang kamu bayar: Rp."+(hargarealme));       
            }
        }
    }
}        