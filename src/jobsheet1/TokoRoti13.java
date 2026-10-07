package jobsheet1;

import java.util.Scanner;
public class TokoRoti13 {
    public static void main(String[] args) {
    int hargaRoti = 27000;
    int modalTetap=1801250;
    int hargaTotalRoti;
    int jumlahPegawai=4;
    int laba;
    double gajiPegawai;
    int sisaKas;
    int jumlahKotak;

    Scanner wika=new Scanner(System.in);

    System.out.print("Masukan jumlah kotak terjual : ");
    jumlahKotak = wika.nextInt();
    
    hargaTotalRoti= jumlahKotak*hargaRoti;

    laba = hargaTotalRoti;

    gajiPegawai= (double) laba/jumlahPegawai;

    sisaKas = modalTetap - hargaTotalRoti;
    
    System.out.println("Pendapatan nya adalah " + hargaTotalRoti);
    System.out.println("Laba nya adalah " + laba);
    System.out.println("Pendapatan per pegawai adalah " + gajiPegawai);
    System.out.println("Sisa kas adalah " + sisaKas);
    //jika input 12
    //output pendapatan dan laba 324000 
    //output pendapatan per pegawai 81000.0
    //output sisa kas 1477250

wika.close();
    }
    
}
