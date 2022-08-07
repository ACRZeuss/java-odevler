import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sayi = kb.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayı çift");
        } else {
            System.out.println("sayı tek");
        }
    }
    
}
