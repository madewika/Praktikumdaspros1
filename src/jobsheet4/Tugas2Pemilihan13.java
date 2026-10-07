package jobsheet4;
import java.util.Scanner;
public class Tugas2Pemilihan13 {
    public static void main(String[] args) {
      Scanner wika = new Scanner(System.in);
      
      System.out.print("Masukan jumlah SKS : ");
      int sks = wika.nextInt();

      if (sks>24) {
       System.out.println("Melebihi batas"); 
      }else{
        System.out.println("SKS valid");
      }

    }
}
