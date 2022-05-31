import java.util.Scanner;
import bangunruang.Balok;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        Balok balok = new Balok();
        //Input Panjang, Lebar, Tinggi
        System.out.println("=====================================================================================================");
        System.out.println("Program Menghitung Volume Balok");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan Panjang = ");
        balok.panjang = keyboard.nextInt();
        System.out.print("Masukkan Lebar = ");
        balok.lebar = keyboard.nextInt();
        System.out.print("Masukkan Tinggi = ");
        balok.tinggi = keyboard.nextInt();
        //Tampilkan Volume Balok
        balok.tampilkanVolumeBalok();
    }
}
