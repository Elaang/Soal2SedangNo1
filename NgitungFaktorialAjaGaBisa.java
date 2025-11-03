package Sekolah.UKL;
import java.util.Scanner;

public class NgitungFaktorialAjaGaBisa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int angka = input.nextInt();
        int faktorial = 1;

        if (angka < 0) {
            System.out.println("Kok malah negatif si, faktorialnya gak bisa didefinisikan broo.");
        } else if (angka == 0) {
            System.out.println("Oke, kau memilih 0. Sekalian aku beri funfact:");
            System.out.println("Faktorial dari 0 adalah 1.");
        } else {
            for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }
    }
        System.out.print(angka + "! " + "= "  );
        for (int i = angka; i >= 2; i--) {
            System.out.print(i + " x ");
        } if (angka > 0) {
            System.out.println("1 = " + faktorial);
        }
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
        input.close();
    }    
}
