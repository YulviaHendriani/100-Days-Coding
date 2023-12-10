
package day62;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner yul = new Scanner (System.in);
        
        while(true){
            System.out.print("Masukkan Username: ");
            String username = yul.nextLine();
            System.out.print("Masukkan Password: ");
            String password = yul.nextLine();
            
            if (username.equals("Yulvia")&& password.equals("071122")){
                System.out.println("Login Berhasil");
                break;
            }else{
                System.out.println("Username/Password salah \n Masukkan dengan benar");
            }
        }
    }
    
}
