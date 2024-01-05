
package day89;
public class Day89 {
    class mahasiswa{
       String nama = "Yulvia";
       String nim = "D0223301";
       
       void datamahasiswa(){
           System.out.println("Nama: "+ nama);
           System.out.println("NIM: "+nim);
       }
    }
    
    public static void main(String[] args) {
     Day89 pertama = new Day89();
     Day89.mahasiswa y = pertama.new mahasiswa();
        System.out.println("Data Mahasiswa");
        System.out.println("______________");
        y.datamahasiswa();
    }
    
}
