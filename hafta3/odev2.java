import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        String x = new Scanner(System.in).nextLine();
        System.out.println(x.charAt(0) == x.charAt(x.length() - 1)  ? "eşit" : "eşit değil");
    }
}