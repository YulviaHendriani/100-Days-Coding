
package day87;

public class Day87 {

    public static void main(String[] args) {
         int[][]angka = {
           {6, 8, 2},
           {3, 5, 1},
           {9, 10, 1}
       };
    int total = 0;
    
    for (int i = 0; i < angka.length; i++){
        for (int j = 0; j < angka[i].length; j++){
            total+= angka[i][j];
        }
    }System.out.println(total);
    }
    
}
