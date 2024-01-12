
package day96;

import java.util.ArrayList;

public class Day96 {

    public static void main(String[] args) {
        ArrayList hewan = new ArrayList<>();
        hewan.add("Anjing");
        hewan.add("Kucing");
        hewan.add("Kelinci");
        hewan.add("Buaya");
        hewan.add("Capung");
        hewan.add("Harimau");
        hewan.add("Domba");
        hewan.add("Hiu");
        hewan.add("jerapa");
        hewan.add("ular");
        
        //menampilkan hewan
        System.out.println(hewan);
        
        //menghapus indeks-3
        hewan.remove(3);
        
        System.out.println(hewan);
        
        //menambah 1 hewan
        hewan.add("Singa");
        
        System.out.println(hewan);
        
        //menampilkan indeks 8
        System.out.println("Indeks ke-8: " + hewan.get(8));  
    }
    
} 
