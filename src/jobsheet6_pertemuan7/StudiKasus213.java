package jobsheet6_pertemuan7;
import java.util.Scanner;
public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        String nama;
        String lomba ;
        String pesan;
        int jumlahDokumen, juara, dokumenKurang;

        System.out.print("Nama Mahasiswa : ");
        nama = wika.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) : ");
        lomba = wika.nextLine();

        if (lomba.equalsIgnoreCase("BELMAWA") || lomba.equalsIgnoreCase("BAKORMA") || lomba.equalsIgnoreCase ("MANDIRI")) {
            System.out.print("Peringkat Juara :");
            juara = wika.nextInt();

            if (juara >=1 && juara <=3) {
                System.out.print("Jumlah dokumen yang di upload : ");
                jumlahDokumen = wika.nextInt();
                if (jumlahDokumen==4) {
                    pesan = "Dokumen Lengkap dan memperoleh juara " + juara +". Dana penghargaan diberikan.";
                } else {
                    dokumenKurang= 4-jumlahDokumen;
                    pesan = "Dokumen tidak lengkap, kurang " + dokumenKurang + ". Dana penghargaan tidak diberikan.";
                }
            } else {
                pesan = "Juara Harapan dan peserta tidak mendapatkan dana penghargaan";
                
            }
        } else if (lomba.equalsIgnoreCase("PKM")) {
            

            
        }

    }
    
}
