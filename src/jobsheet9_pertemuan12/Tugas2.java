package jobsheet9_pertemuan12;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner wika = new  Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"}; 
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000}; 

        System.out.println("==========DAFTAR MENU==========");
        for (int i = 0; i < harga.length; i++) {
            System.out.println((i+1) + ". " + menu[i] + ", Rp." + harga[i]);
        }

        System.out.print("Ketik nama menu untuk melihat ketersediaaan : ");
        String key = wika.nextLine();

        if (!key.isEmpty()) {
            int search = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(key)) {
                    search = i;
                    break;
                }
            }

            if (search!=-1) {
                System.out.println("Menu " + menu[search] + " Tersedia dengan harga Rp." + harga[search]);
            } else {
                System.out.println("Maaf, menu tidak tersedia.");
            }
        }

        System.out.print("Masukan jumlah pesanan : ");
        int jumlahItem = wika.nextInt();
        wika.nextLine();
       

        String pesanan[] = new String[jumlahItem];
        int hargaPesanan[] = new int[jumlahItem];
        int totalBiaya=0;

        for (int i = 0; i < jumlahItem; i++) {
            int foundMenu=-1;
            
            while (foundMenu==-1) {
                System.out.print("Masukan nama menu ke-" + (i+1) + " : ");
                String namaDipilih = wika.nextLine().trim();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaDipilih)) {
                        foundMenu=j;
                        break;
                    }
                }

                if (foundMenu==-1) {
                System.out.println("Menu tidak ditemukan! Silakan masukkan nama menu yang ada di daftar.");
        
            }
            }

            

            pesanan[i] = menu[foundMenu];
            hargaPesanan[i] = harga[foundMenu];
            totalBiaya += harga[foundMenu];
            
        }

        System.out.println("=====================RINGKASAN PESANAN=====================");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("--------------------------------");
        System.out.println("Total Biaya : Rp" + totalBiaya);
}   }      
        