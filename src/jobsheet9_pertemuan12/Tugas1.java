package jobsheet9_pertemuan12;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);

        System.out.print("Masukan banyaknya mahasiswa : ");
        int jmlhMahasiswa = wika.nextInt();

        int nilai[] = new int[jmlhMahasiswa];

        int total=0;
        double rata;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = wika.nextInt();

            total+=nilai[i];
        }

        rata = (double) total/nilai.length;

        int tertinggi = nilai[0]; 
        int terendah = nilai[0]; 
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i]>tertinggi) {
                tertinggi = nilai[i];
            } 

            if (nilai[i]<terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("===================================");
       for (int i = 0; i < nilai.length; i++) {
        if (nilai[i]>=75) {
            System.out.println("Mahasiswa ke-" + (i+1) + " dengan Nilai " + nilai[i] + " (LULUS) ");
        } else {
            System.out.println("Mahasiswa ke-" + (i+1) + " dengan Nilai " + nilai[i] + " (TIDAK LULUS) ");
        } 
        
       }
        System.out.println("===================================");
        System.out.println("Nilai rata-rata mahasiswa : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terndah : " + terendah);
    }
    }   
