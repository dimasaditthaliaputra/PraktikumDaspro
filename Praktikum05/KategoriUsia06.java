import java.util.Scanner;

public class KategoriUsia06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        String kategoriUsia;

        System.out.print("Masukkan usia = ");
        usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Input tidak boleh angka negatif!");
        } else {
            if (usia >= 0 && usia <= 12) {
                kategoriUsia = "Anak";
            } else if (usia >= 13 && usia <= 19) {
                kategoriUsia = "Remaja";
            } else if (usia >= 20 && usia <= 64) {
                kategoriUsia = "Dewasa";
            } else {
                kategoriUsia = "Lansia";
            }
            System.out.println("Kategori usia = " + kategoriUsia);
        }
    }
}
