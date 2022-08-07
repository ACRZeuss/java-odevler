import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        int not = kb.nextInt();
        System.out.println("Biyoloji notunuzu giriniz: ");
        int not2 = kb.nextInt();

        if (not >= 80 && not2 >= 90) {
            System.out.println("Tebrikler tıp kazandınız");
        }
        else if (not >= 80 && not2 < 90) {
            System.out.println("Tebrikler mühendislik kazandınız");
        }
        else {
            System.out.println("kaldınız");
        }

    }
}
