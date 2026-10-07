package jobsheet2;

public class LuasTanahNonDinamis {
    public static void main(String[] args) {
        double panjang = 100;
        double lebar = 30;
        double diameterLingkaran = 5;
        double sisiPagar = 2;
        double sisaluasTanah;
        double phi = 3.14;
        double jarijari = diameterLingkaran / 2;

        sisaluasTanah = (panjang * lebar) - ((phi * jarijari * jarijari) + (sisiPagar * sisiPagar));
        System.out.println("Sisa luas tanah Pak Tono adalah " + sisaluasTanah + " meter persegi");
    }
}
