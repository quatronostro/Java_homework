package HayvanTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Runner {

    static Scanner scan = new Scanner(System.in);

    static StringBuilder tahmin;

    public static void main(String[] args) {

        Hayvan[] hayvanlar = {new Kedi(), new Kopek(), new Inek(), new Kuzu()};

        Random rnd = new Random();
        int randomSayi = rnd.nextInt(4);

        Hayvan randomHayvan = hayvanlar[randomSayi];

        int flag = 3;

        System.out.println("HAYVAN TAHMİN OYUNUNA HOŞGELDİNİZ!!!" +
                "Aklımdan geçirdiğim hayvan ismini tahmin edebilir misin?");

        while (flag != 0){

            System.out.print("Bu hayvan ");
            randomHayvan.hareket();
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler...");
                break;
            } else {
                System.out.println("Yanlış Tahmin, lütfen tekrar deneyiniz.");
                flag--;
            }

            System.out.println("Bu hayvanın eti yenir mi? " + randomHayvan.isYenir());
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler...");
                break;
            } else {
                System.out.println("Yanlış Tahmin, lütfen tekrar deneyiniz.");
                flag--;
            }

            System.out.println("Bu sesi hangi hayvan çıkarır? " + randomHayvan.getSes());
            tahmin = new StringBuilder(scan.next().toLowerCase());

            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler...");
                break;
            } else {
                System.out.println("Yanlış Tahmin, lütfen tekrar deneyiniz.");
                flag--;
            }


        }

        if (flag == 0){
            System.out.println("Tahmin hakkınız doldu. Doğru hayvan ismi : " + randomHayvan.isim + " olacaktı.");
        }


    }
}
