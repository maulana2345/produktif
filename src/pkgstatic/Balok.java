package pkgstatic;
import java.util.Scanner;
public class Balok {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        
        System.out.println("Luas permukaan Balok adalah: " + hitungLuasPermukaan(p, l, t));        
        System.out.println("Volume Balok adalah: " + volume(p, l, t));
    }
    
    static int hitungLuasPermukaan(int p, int l, int t){
        int hasil = 2 * ((p * l) + (p * t) + (l * t));
        return hasil;
    }
    
    static int volume(int p, int l, int t){
        int hasil = p * l * t;
        return hasil;
    }
    
}
