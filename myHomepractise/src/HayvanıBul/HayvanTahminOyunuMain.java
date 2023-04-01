package HayvanıBul;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HayvanTahminOyunuMain {

    static Scanner scan = new Scanner(System.in);
    static StringBuilder tahmin;

    public static void main(String[] args) throws InterruptedException {

        /*

        Bir hayvan ismi tahmin oyunu yaratalım. Bu oyunda yazacağımız program random class'ından yardım alakar
        kullanıcının görmediği bir hayvan seçsin. Bu hayvanın özellikleri kullanıcıya verilerek tahmin yürütülmesi istensin.

        Class ilişkisi :
        Parent olan abstract bir Hayvan class'ı ve abstract özellikleri olsun.
        Bu class'a bağlı kedi, köpek, inek ve kuzu child class'ları olsun.
        Main class içinde bu chlid class'ları bir array içinde muhafaza edelim.
        Sonra program random class yardımı ile bir hayvan seçsin ve bu seçtiği
        hayvanı user tahmin edip bulmaya çalışsın.

         */

        Hayvan[] hayvans = {new Kedi(), new Kopek(), new Inek(), new Kuzu()};

        int flag = 3;

        System.out.println("Hayvan tahmin oyununa hoşgeldiniz." +
                "\nAklımdan geçirdiğim hayvanı tahmin edebilir misin?");

        Random rnd = new Random();
        int randomNum = rnd.nextInt(4);

        Hayvan randomHayvan = hayvans[randomNum];

        while (flag != 0){

            System.out.print("\nBu hayvan : ");
            randomHayvan.hareket();
            tahmin = new StringBuilder(scan.next().toLowerCase());
            System.out.println("\nCevabınız Kontrol ediliyor...");
            TimeUnit.SECONDS.sleep(2);
            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlış tahmin. Lütfen tekrar deneyin!");
                flag--;
            }

            System.out.println("Bu hayvanın eti yenir mi? " + randomHayvan.isYenir());
            tahmin = new StringBuilder(scan.next().toLowerCase());
            System.out.println("\nCevabınız Kontrol ediliyor...");
            TimeUnit.SECONDS.sleep(2);
            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlış tahmin. Lütfen tekrar deneyin!");
                flag--;
            }

            System.out.println("\nBu sesi hangi hayvan çıkarır?" +
                    "\n " + randomHayvan.getSes());
            tahmin = new StringBuilder(scan.next().toLowerCase());
            System.out.println("\nCevabınız Kontrol ediliyor...");
            TimeUnit.SECONDS.sleep(2);
            if (randomHayvan.isDogruTahmin(tahmin)){
                System.out.println("Doğru Tahmin, Tebrikler!");
                break;
            } else {
                System.out.println("Yanlış tahmin. Lütfen tekrar deneyin!");
                flag--;
            }

            if (flag == 0){
                System.out.println("Tahmin hakkınızı doldurdunuz. Doğru cevap " + randomHayvan.isim + " olacaktı");
                break;
            }


        }



    }



}
