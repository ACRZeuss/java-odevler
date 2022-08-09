import java.util.Scanner;
 
public class odev3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("****YEMEĞİNİZİ SEÇİNİZ***");
        System.out.println("1. İSKENDER");
        System.out.println("2. ADANA KEBAP");
        System.out.println("3. MUSAKKA");
        System.out.println("4. ŞIRDAN");
        System.out.println("****Boş seçmek isterseniz 0'a basınız****");

        int iskender = 90;
        int adana = 85;
        int musakka = 75;
        int sirdan = 65;
        
        System.out.print("1. Secimininizi giriniz: ");
        int secim = scan.nextInt();
        System.out.println("2. Seciminizi giriniz: ");
        int secim2 = scan.nextInt();
        
        if(secim + secim2 == 1 + 2) {
            System.out.println("Sepet Tutarı = " + (iskender + adana) + "TL");
        }
        else if(secim + secim2 == 2 + 3) {
            System.out.println("Sepet Tutarı = " + (adana + musakka) + "TL");
        }
        else if(secim + secim2 == 3 + 4) {
            System.out.println("Sepet Tutarı = " + (musakka + sirdan) + "TL");
        }
        else if (secim + secim2 == 4 + 1) {
            System.out.println("Sepet Tutarı = " + (iskender + sirdan) + "TL");
        }
        else if (secim + secim2 == 1 + 3) {
            System.out.println("Sepet Tutarı = " + (iskender + musakka) + "TL");
        }
        else if (secim + secim2 == 2 + 4) {
            System.out.println("Sepet Tutarı = " + (adana + sirdan) + "TL");
        }
        else if (secim + secim2 == 1 + 0) {
            System.out.println("Sepet Tutarı = " + iskender + "TL");
        }
        else if (secim + secim2 == 2 + 0) {
            System.out.println("Sepet Tutarı = " + adana + "TL");
        }
        else if (secim + secim2 == 3 + 0) {
            System.out.println("Sepet Tutarı = " + musakka + "TL");
        }
        else if (secim + secim2 == 4 + 0) {
            System.out.println("Sepet Tutarı = " + sirdan + "TL");
        }
        else {
            System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
        }
    }
}