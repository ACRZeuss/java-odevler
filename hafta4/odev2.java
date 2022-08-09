package hafta4;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String isim = kb.next();

        for (int i = isim.length()-1; i >= 0; i--) {
            System.out.print(isim.charAt(i));
        }

    }

}
