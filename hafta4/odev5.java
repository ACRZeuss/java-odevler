package hafta4;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String cumle = kb.nextLine();

        String str = cumle, reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " Palindrome.");
        } else {
            System.out.println(str + " Palindrome değil.");
        }
    }

}
