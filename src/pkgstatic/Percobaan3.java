package pkgstatic;
import java.util.Scanner;
public class Percobaan3 {
    
    static double hitungBunga(double saldo, int tahun){
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungBunga(saldo, tahun - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = input.nextInt();
        System.out.print("Lamanya menabung (tahun): ");
        int tahun = input.nextInt();
        System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }   
}
