
package day56;
import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas: ");
        int batas = input.nextInt();
        
        for (int i=1;i<=batas;i++){
            if (batas%2==0&&i%2==0){
                System.out.println(i);
            }else if(batas%2==1&&i%2==1){
                System.out.println(i);
        }
        }
    }
    
}
