// Rap türüne ait sınıf
import java.util.ArrayList;

class Rap extends Songs {
    // Rap türünde şarkıları içeren arreylist
    ArrayList<String> rapSongs = new ArrayList<>();

    // Rap sınıfının constructor metodu ile arreylist'e şarkı ekler
    public Rap() {
        //63 adet şarkı eklendi
        rapSongs.add("Nereden - Motive");
        rapSongs.add("10MG - Motive");
        rapSongs.add("Makaveli - Motive");
        rapSongs.add("Masal - Motive");
        rapSongs.add("Holocaust - Ceza");
        rapSongs.add("Son Vites - Tankurt Manas");
        rapSongs.add("Mola - Tankurt Manas");
        rapSongs.add("Uçuyorum - Tankurt Manas");
        rapSongs.add("Microphone Show - Joker");
        rapSongs.add("Halen - Sagopa Kajmer & Dr.Fuchs");
        rapSongs.add("Aklımı Kaçırmadığım Bir Gün Daha - Sagopa Kajmer");
        rapSongs.add("Kim - Sagopa Kajmer");
        rapSongs.add("Toz Taneleri - Sagopa Kajmer");
        rapSongs.add("Ölüme İnat - Hidra");
        rapSongs.add("Göçmen - Hidra");
        rapSongs.add("Musallat - Hidra");
        rapSongs.add("Baağırın - Hidra");
        rapSongs.add("Gibi - Hidra");
        rapSongs.add("Dip - Hidra");
        rapSongs.add("Kimsin Sen - Hidra");
        rapSongs.add("Uyuma - Grogi");
        rapSongs.add("Mr.Robot - Grogi");
        rapSongs.add("Hayret - Grogi");
        rapSongs.add("Dilsiz - Allame");
        rapSongs.add("Her Şekil Flex - Allame");
        rapSongs.add("Bir Dakika - Allame");
        rapSongs.add("Yok - Allame");
        rapSongs.add("Poz - Allame");
        rapSongs.add("Baba - Allame");
        rapSongs.add("Rastafaray - Ais Ezhel");
        rapSongs.add("3 Gün - Ais Ezhel");
        rapSongs.add("Koydular - Ais Ezhel");
        rapSongs.add("Niyet Hiphop - Ezhel");
        rapSongs.add("Hayat Dersi - Ezhel");
        rapSongs.add("Zihnimiz Özgür - Ais Ezhel");
        rapSongs.add("Geri Geldi - Fuat");
        rapSongs.add("Rakibin Benim - Fuat");
        rapSongs.add("Rast Gel Kazara - Fuat");
        rapSongs.add("Kefeni Yolla - Fuat");
        rapSongs.add("Rapim Cevap Olur - Dr.Fuchs");
        rapSongs.add("Sevaplarım Günahlarım - Dr.Fuchs");
        rapSongs.add("Bilmelisin - Dr.Fuchs");
        rapSongs.add("İstanbul - Nefret");
        rapSongs.add("Kolera- Sen Nasıl Bir İnsansın");
        rapSongs.add("Anahtar - Nefret");
        rapSongs.add("Ben Ağlamazken - Ceza");
        rapSongs.add("Kaçak Marlboro - Karaçalı");
        rapSongs.add("Eskimiş Senelere - Aspova");
        rapSongs.add("Yerli Plaka - Ceza");
        rapSongs.add("Çıktık Yine Yollara - Norm Ender");
        rapSongs.add("Geçmişi Olmayan Adam - Boramess");
        rapSongs.add("14BK - Şam");
        rapSongs.add("Teneke Trampet - Ağaçkakan");
        rapSongs.add("Pelesenk - Sansar Salvo");
        rapSongs.add("Dudaklarında Yalan Kalmış - Taladro");
        rapSongs.add("Gece Geceyi - Ağaçkakan");
        rapSongs.add("Korkularıma Dair - Sokrat St");
        rapSongs.add("Romantizma - Sagopa Kajmer");
        rapSongs.add("Dark Places - Ceza,Tech N9ne");
        rapSongs.add("Çoban Yıldızı - Hayki");
        rapSongs.add("Böyle İyi - No.1");
        rapSongs.add("Cümle Mühendisi - Sagopa Kajmer");
        rapSongs.add("Mesela Yani - Kayra");

        super.setSongs(rapSongs);    // arreylist'i super sınıfın (Songs sınıfı) arreylistine atar
    }
}