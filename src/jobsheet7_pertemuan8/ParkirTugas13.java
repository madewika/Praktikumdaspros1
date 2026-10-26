package jobsheet7_pertemuan8;
import java.util.Scanner;
public class ParkirTugas13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);
        Scanner string = new Scanner (System.in);
        String jenis;
        int durasi, total=0, totalPerhari=0;
        int mobil = 2750, motor = 1750;

        do {
            System.out.println("------------------PARKING------------------");
            System.out.print("Masukan Durasi Parkir : ");
            durasi = wika.nextInt();

            if (durasi == 0) {
                System.out.println("Selesai");
                break;
            }
            if (durasi<0) {
                System.out.println("Durasi tidak valid");
                continue;
            } 

             System.out.print("Masukan jenis kendaraan (Mobil/Motor) : ");
             jenis = string.nextLine();

             if (jenis.equalsIgnoreCase("Mobil")||jenis.equalsIgnoreCase("Motor")) {
                if (jenis.equalsIgnoreCase("Mobil")) {
                    total = durasi*mobil;
                } else {
                    total = durasi*motor; 
                }
             } else {
                total = 0;
                System.out.println("Jenis Kendaraan tidak Valid"); 
             }

             System.out.println("Biaya Parkir : "+ total);

             totalPerhari +=total;

             System.out.println("Total Hari ini : " + totalPerhari);
            }while (true);

        }
        
             
        
}

