package jobsheet2;

public class GajiTunjanganNonDinamis {
public static void main(String[] args) {
    int gajiPokok = 5000000;
    int tunjangan = 100000;
    int jmlh_anak = 4;
    double pensiunan = 0.1;
    double gajiBersih;

    gajiBersih = gajiPokok - (gajiPokok * pensiunan) + (tunjangan * jmlh_anak);
    System.out.println("Gaji Bersih Pak Danur adalah " + gajiBersih);
}
}