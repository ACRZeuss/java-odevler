package hafta4;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sayac_a = 0;
        int sayac_e = 0;

        String cumle = kb.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a' || cumle.charAt(i) == 'A') {
                sayac_a++;
            }
            if (cumle.charAt(i) == 'e' || cumle.charAt(i) == 'E') {
                sayac_e++;
            }
        }
        System.out.println("Girilen cumle veya kelimede " + sayac_a + " tane 'a'  harfi vardir.");
        System.out.println("Girilen cumle veya kelimede " + sayac_e + " tane 'e'  harfi vardir.");
    }

}
