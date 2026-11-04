package jobsheet8_pertemuan10;
import java.util.Scanner;
public class nilaiKelompok13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        int nilai;

        System.out.print("Masukan jumlah kelompok : ");
        int jumlahKelompok = wika.nextInt();

        System.out.print("Masukan jumlah penilaian : ");
        int jumlahPenilai = wika.nextInt();

        if (jumlahKelompok<=0||jumlahPenilai<=0) {
            System.out.print("Jumlah kelompok dan penilai harus lebih dari 0.");
        } else {
            int nomorKelompok=1;
            double rataTertinggi = -1; 
            int kelompokTerbaik = 0; 

            while (nomorKelompok <= jumlahKelompok) {
                 System.out.println("Kelompok " + nomorKelompok); 
                 double totalNilai = 0; 

                 for (int j = 1; j <= jumlahPenilai; j++) {
                    do {
                        System.out.print("  Nilai dari penilai "+ j +": ");
                        nilai = wika.nextInt();

                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai+=nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;


               }  
               System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
             }

    }
         }
    

