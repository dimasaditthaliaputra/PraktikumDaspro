import java.util.Scanner;
public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, kualifikasi, nilaiHuruf;        
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = ( nilaiKuis + nilaiTugas + nilaiUjian ) / 3;

        if ( nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if ( nilaiAkhir > 73 && nilaiAkhir <= 80 ) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if ( nilaiAkhir > 65 && nilaiAkhir <= 73 ) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if ( nilaiAkhir > 60 && nilaiAkhir <= 65 ) {
            nilaiHuruf = "C+";
            kualifikasi = "lebih dari Cukup";
        } else if ( nilaiAkhir > 39 && nilaiAkhir <= 50 ) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas +  " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
