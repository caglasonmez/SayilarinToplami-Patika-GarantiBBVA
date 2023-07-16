package CaglaSonmez;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir sayı giriniz : ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi; //toplam = toplam + sayi;
            }
        } while (sayi != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
