import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String kelime = kb.nextLine();

        int uzunluk = kelime.length();
        
        if (uzunluk > 10) {
            System.out.println("10 karakterden büyük");
        }
        else {
            System.out.println("10 karakterden küçük");
        }
    }
    
    
}
