import java.util.Scanner;
public class PemilihanBilangan06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}
