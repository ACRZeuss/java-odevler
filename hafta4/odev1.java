package hafta4;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int sayi = kb.nextInt();

        for (int i = 0; i < sayi; i++) {
            System.out.println(i);
        }

        System.out.println("****TERSTEN YAZDIRILIYOR****");

        for (int i = sayi - 1; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("****ÇİFT SAYILAR İÇİN YAZDIRILIYOR****");

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("****TEK SAYILAR İÇİN YAZDIRILIYOR****");

        for (int i = 0; i < sayi; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}