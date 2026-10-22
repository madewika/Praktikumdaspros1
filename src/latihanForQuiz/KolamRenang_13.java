package latihanForQuiz;
import java.util.Scanner;
public class KolamRenang_13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        int jenisOrang=0, diskon=0;
        int banyakTiket, hargaKotor=0;
        int hargaTiket=0, hargaTotal=0;
        String pesan ;
        boolean isrombongan;

        System.out.print("Masukan banyakya tiket ");
        banyakTiket=wika.nextInt();

        System.out.println("Masukan layanan");
        jenisOrang=wika.nextInt();

        if (banyakTiket>=1 && banyakTiket<=30) {
            switch (jenisOrang) {
                case 1:
                    hargaTiket=16000;
                    hargaKotor = hargaTiket*banyakTiket;
                    break;
                case 2 :
                    hargaTiket=26000;
                    hargaKotor = hargaTiket*banyakTiket;
                    break;
                case 3 :
                    hargaTiket=11000;
                    hargaKotor = hargaTiket*banyakTiket;
            
                default:
                    break;
            }
            
        } else {
            pesan ="Input tidak valid";
            
        }
        if (banyakTiket>12) {
            if (jenisOrang==1) {
                diskon = 14000;
                hargaTotal=(banyakTiket-12)*14000;
            } else if (jenisOrang==2) {
                diskon = 24000;
                hargaTotal=(banyakTiket-12)*24000;
            } else if (jenisOrang==3) {
                diskon = 9000;
                hargaTotal=(banyakTiket-12)*9000;
            } else {
                
            } 
            
            
        } else if (banyakTiket>=21) {
            diskon = (banyakTiket*hargaTiket)-(banyakTiket*hargaTiket*15/100);
        } else {
            diskon=0;
            
        }
        
        System.out.println("Layanan " + jenisOrang);
        System.out.println("biaya dasar " + hargaKotor);
        System.out.println("diskon" + diskon);
        System.out.println("Harga Total"+hargaTotal);

        //p=13

        //16000
        //26000
        //11000
        //11
        //21

        //output 33600, 14000,126000 ketika memasukan tiket 21, layanan 1

    }
}
