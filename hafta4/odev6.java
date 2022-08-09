package hafta4;

import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int toplam = 0;
        System.out.println("kaç sayi girmek istersiniz?");
        int n = kb.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            double sayi = kb.nextDouble();
            toplam += sayi;
        }

        double ortalama = (double) toplam / n;
        System.out.println("Bu " + n + " sayinin ortalamasi: " + ortalama);
    }

}
