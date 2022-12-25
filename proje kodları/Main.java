import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Girdi almak için scanner sınıfı çağırıldı

        System.out.println("\n\n********MUSICTOPIA'a Hoşgeldiniz********");
        System.out.println("********By Can,İlayda,Kayra********\n\n\n" +
                "      MÜSICTOPIA\n" +
                "0:35 ━❍──────── -5:32\n" +
                "↻     ⊲  Ⅱ  ⊳     ↺\n" +
                "VOLUME: ▁▂▃▄▅▆▇ 100%\n\n");

        for (; ;) {    //Birden fazla sorhu yapmak için sonsuz döngü

            int welcomeAnswer, questionGenre;
            String genre,devam;

            System.out.println("1- Şaşırt Beni(Hazırladığımız Quiz'e Gir)");
            System.out.println("2- İstediğim türde öneri ver");
            System.out.print("Seçiminiz: ");
            welcomeAnswer = sc.nextInt();

            if (welcomeAnswer == 1){
                questionGenre = Questions.EmpressMe();   //Testin sonucu atandı
                if (questionGenre == 1){     //Testin sonucu string değere atandı
                    genre = "rap";
                } else if (questionGenre == 2) {
                    genre = "rock";
                } else if (questionGenre == 3) {
                    genre = "classical";
                } else if (questionGenre == 4) {
                    genre = "pop";
                }else {
                    genre = "electronic";
                }

            } else if (welcomeAnswer == 2) {
                System.out.print("\n\nEnter the song genre (rock, classical, rap, pop, electronic): ");
                genre = sc.next();
            }else {     //İlk soruya yanlış cevap verilmesi durumunda başa yeniden yönlendirildi
                continue;
            }


            // Kullanıcıdan aldığımız türü kontrol et
            Songs songs = null;    //Songs sınıfı içi boş olarak çağırıldı

            if (genre.equalsIgnoreCase("rock")) {    //Seçilen türe göre songs sınıfına atama yapıldı
                songs = new Rock();
            } else if (genre.equalsIgnoreCase("classical")) {
                songs = new Classical();
            } else if (genre.equalsIgnoreCase("rap")) {
                songs = new Rap();
            } else if (genre.equalsIgnoreCase("pop")) {
                songs = new Pop();
            } else if (genre.equalsIgnoreCase("electronic")) {
                songs = new Electronic();
            } else {
                System.out.println("Invalid genre.");
                return;
            }

            System.out.println("\nBİZDEN SANA 10 ADET " +
                    songs.getClass().getSimpleName() +" TÜRÜNDEN ŞARKI");

            songs.suggestSongs();  // Önerilen şarkıları göster

            for (;;) {


                System.out.println("\n\nFarklı bir sorgu yapmak istiyor musunuz ?  (e/h) ");
                System.out.print("Seçiminiz: ");
                devam = sc.next();

                if (devam.equalsIgnoreCase("e")) {
                    break;
                } else if (devam.equalsIgnoreCase("h")) {
                    break;
                } else {
                    System.out.println("Yanlış girdi !!!");
                }

            }
            if (devam.equalsIgnoreCase("h")){   //Uygulamadan çıkmak istenildiği takdirde sonsuz döngünün kırılması
                break;
            }
        }

        System.out.println("\n\nÖnerilerinizle keyifli vakit geçirmeniz dileğiyle :) \nİyi Günler Dileriz");

    }
}