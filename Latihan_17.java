import java.util.Scanner;

public class Latihan_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========Program Tunjangan==========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = input.next();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok     : Rp %.0f%n", gajiPokok);
        System.out.printf("Tunjangan      : Rp %.0f%n", tunjangan);
        System.out.printf("Total Gaji     : Rp %.0f%n", totalGaji);
        System.out.println("(Developed by: Rizki Adam Kurniawan)");
    }
}
