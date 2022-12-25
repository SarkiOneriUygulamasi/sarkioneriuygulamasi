//Şarkıların abstarct üst sınıfı
import java.util.ArrayList;
import java.util.Random;

// Soyut sınıf
abstract class Songs {
    ArrayList<String> songsList;

    // getter methodu ile arreylisti döndürür
    public ArrayList<String> getSongs() {
        return songsList;
    }

    // setter methodu ile arreylist'e şarkı ekler
    public void setSongs(ArrayList<String> songs) {     //Arreylistteki şarkıları Songs sınıfını Arreylistine atar.
        this.songsList = songs;
    }
    // Rastgele on şarkı önerecek metod
    public void suggestSongs() {
        Random rand = new Random();  //Rastgele şarkı önermemezi sağlayan method
        for (int i = 0; i < 10; i++) {
            int index = rand.nextInt(songsList.size());
            System.out.println(songsList.get(index));
        }
    }
}