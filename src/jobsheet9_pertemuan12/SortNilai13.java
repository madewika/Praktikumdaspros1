package jobsheet9_pertemuan12;
import java.util.Arrays;
public class SortNilai13 {
    public static void main(String[] args) {
        int[] nilai = {33, 48, 35, 63, 13, 38};
        
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length -1 - i; j++) {
                if (nilai [j] > nilai[j+1]) {
                    int temp = nilai[j];
                    nilai [j] = nilai[j+1];
                    nilai[j + 1] = temp; 
                }
            }
            
        }

        System.out.println(Arrays.toString(nilai));
    }
    
}
