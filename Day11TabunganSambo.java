
package day11tabungansambo;


public class Day11TabunganSambo {

    public static void main(String[] args) {
        
        // Menghitung berapa tahun Sambo harus menabung untuk membeli pc gaming
        
        double harga_pc = 150000000;
        double tabungan_perbulan = 5000000;
        double jumlah_bulan_untuk_menabung = harga_pc/tabungan_perbulan;
        double jumlah_bulan_dalam_satu_tahun = 12;
        System.out.println("Tahun yang dibutuhkan untuk menabung demi membeli pc gaming adalah: " + (jumlah_bulan_untuk_menabung/jumlah_bulan_dalam_satu_tahun)+ " Tahun");
        
    }
    
}
