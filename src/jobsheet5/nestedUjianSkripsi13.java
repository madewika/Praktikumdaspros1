package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi13 {
public static void main(String[] args) {
    Scanner wika = new Scanner(System.in);
    String pesan;

    System.out.print("Apakah Mahasiswa bebas kompen? (Ya/Tidak): ");
    String bebasKompen = wika.nextLine().trim();

    System.out.print("Masukan jumlah log bimbingan pembimbing 1: ");
    int bimbinganP1 = wika.nextInt();

    System.out.print("Masukan jumlah log pembimbing 2: ");
    int bimbinganP2 = wika.nextInt();

    if (bebasKompen.equalsIgnoreCase("Ya")) {
        if (bimbinganP1 >=9 && bimbinganP2 >= 4) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 <9 && bimbinganP2 < 4) {
            pesan = "Gagal! Log bimbingan p1 kurang dari 9 kali dan p2 kurang dari 4 kali";
        } else if (bimbinganP1<9) {
            pesan = "Gagal! Log bimbingan p1 belum mencapai 9 kali";
        } else {
            pesan = "Gagal! Log bimbingan p2 belum mencapai 4 kali";     
    } 
    }else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen" ;
    }
   System.out.println(pesan);


}
    
}


