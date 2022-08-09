import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int not = kb.nextInt();

        if (not >= 85 && not <= 100) {
            System.out.println("Tebrikler 5 aldınız");
        }
        else if (not >= 75 && not <= 84) {
            System.out.println("Tebrikler 4 aldınız");
        }
        else if (not >= 65 && not <= 74) {
            System.out.println("3 aldınız");
        }
        else if (not >= 55 && not <= 64) {
            System.out.println("2 aldınız");
        }
        else if (not >= 45 && not <= 54) {
            System.out.println("1 aldınız");
        }
        else if (not >= 0 && not <= 44) {
            System.out.println("Kaldınız");
        }
        else {
            System.out.println("Geçersiz sayı");
        }
    }
    
}
