
package day39;
import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();
        
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
    }
    
}
