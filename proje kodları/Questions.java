import java.util.Scanner;

public class Questions {

    public static int EmpressMe () {

        int rap = 0, rock = 0, classical = 0, pop = 0, electronic = 0;
        Scanner scan = new Scanner(System.in);
        String answer;


        for (; ; ) {

            System.out.println("\n\n1-Müzikten beklediğin şey nedir?\n" +
                    "A)Ruhu Dinlendirmesi \n" +
                    "B)Cool Bir Melodi \n" +
                    "C)Muhteşem Gitar Soloları \n" +
                    "D)Beni Eğlendirmesi \n" +
                    "E)Derdime İlaç Olması ");
            System.out.print("Seçiminiz: ");          // Sorular ve cevaplerının hangi türü etkilediği ele alınır.
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                classical++;
                break;           // Cevap alınması durumunda sonraki soruya geçilir.
            } else if (answer.equalsIgnoreCase("b")) {
                electronic++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                pop++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                rap++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");
                // Yanlış cevap girilmesi durumunda soru tekrar sorulur.
            }

        }


        for (; ; ) {

            System.out.println("\n2-Hangisi sana göre çok abartılmıştır?\n" +
                    "A)Kokuşmuş Popçular \n" +
                    "B)Müzikte Tür Ayrımı \n" +
                    "C)Rakı Sofrası \n" +
                    "D)Electronic Müzik \n" +
                    "E)Kemik Gözlük ");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                classical++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                pop++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                electronic++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");

            }

        }


        for (; ; ) {

            System.out.println("\n3-Sana göre hangisi hak ettiği değeri bulamamış, muadillerinin gölgesinde kalmıştır?\n" +
                    "A)Bas Gitar \n" +
                    "B)Aleyna Tilki \n" +
                    "C)Diyar Pala \n" +
                    "D)Henryk Górecki \n" +
                    "E)Beatbox Müzik \n");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                pop++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                classical++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                electronic++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");

            }

        }


        for (; ; ) {

            System.out.println("\n4-Müzik Güncel Olmalı mıdır?\n" +
                    "A)Evet \n" +
                    "B)Hayır ");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                electronic++;
                pop++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                rock++;
                classical++;
                pop++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");

            }

        }


        for (; ; ) {

            System.out.println("\n5-Bir şarkıda sözler sence ne kadar önemli?\n" +
                    "A)En Önemlisi Sözler \n" +
                    "B)En Önemlisi Ritim \n" +
                    "C)Sözler Çok Önemli Ama Ritim Daha Ön Planda \n" +
                    "D)Sözler Çok Önemli Değil, Ritim Önemli ");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                electronic++;
                classical++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                pop++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");

            }

        }


        for (; ; ) {

            System.out.println("\n6-Bir hafta sonu etkinliği olarak hangisini tercih edersin?\n" +
                    "A)Tiyatroya gitmek ya da müze gezmek \n" +
                    "B)Fitnessa gitmek ya da stadyumda maç izlemek \n" +
                    "C)Gece kulübüne gitmeyi ya da güzel bir restoranda yemek yemeyi \n" +
                    "D)Şöyle güzel bir konsept bara gitmek ya da iyi bir sergiye katılmak \n" +
                    "E)Hadise Konseri \n");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                classical++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                electronic++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                pop++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");
            }

        }


        for (; ; ) {

            System.out.println("\n7-Konsere gitmek senin için daha çok hangi anlama geliyor?\n" +
                    "A)Konser kimin olursa olsun müziğin keyfini çıkarmak için \n" +
                    "B)Story Çekmek İçin \n" +
                    "C)Stres Atmak, Biraz Daha İyi Hissetmek İçin \n" +
                    "D)Deli Gibi Dans Etmek İçin \n" +
                    "E)Dinlediğim Sanatçılar Konser Vermiyor ");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                pop++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                electronic++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                classical++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");
            }

        }


        for (; ; ) {

            System.out.println("\n8-Müzik...\n" +
                    "A)Stresin yerini heyecanın almasını sağlayan bir yapıt \n" +
                    "B)Duştan Çıkınca Kafandan Damlayan Su Damlalarının Hissettirdiği Rahatlık \n" +
                    "C)Dinleyen Bir insan ya Ceza ya Sago Dinlemeli \n" +
                    "D)Discoda tenimde hissettiğim Bassın Hissettirdiği Zevk \n" +
                    "E)Arabada son ses Ebru Gündeş\n");
            System.out.print("Seçiminiz: ");
            answer = scan.next();
            if (answer.equalsIgnoreCase("a")) {
                rock++;
                break;
            } else if (answer.equalsIgnoreCase("b")) {
                classical++;
                break;
            } else if (answer.equalsIgnoreCase("c")) {
                rap++;
                break;
            } else if (answer.equalsIgnoreCase("d")) {
                electronic++;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                pop++;
                break;
            } else {
                System.out.println("Yanlış bir sonuç girdiniz !!! \n Lütfen yeniden deneyiniz.");
            }

        }

        int max = rap;   // En çok oy olan türe karar verilir.

        if (rock > max) {
            max = rock;
        }
        if (classical > max) {
            max = classical;
        }
        if (pop > max) {
            max = pop;
        }
        if (electronic > max) {
            max = electronic;
        }


        if (max == rap) {
            return 1;
        } else if (max == rock) {
            return 2;
        } else if (max == classical) {
            return 3;
        } else if (max == pop) {
            return 4;
        }else {
            return 5;
        }
    }
}
