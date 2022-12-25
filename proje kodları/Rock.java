// Rock türüne ait sınıf
import java.util.ArrayList;
class Rock extends Songs {
    // Rock türünde şarkıları içeren arreylist
    ArrayList<String> rockSongs = new ArrayList<>();

    // Rock sınıfının constructor metodu ile arreylist'e şarkı ekler
    public Rock() {
        //67 adet şarkı eklendi
        rockSongs.add("Bohemian Rhapsody - Queen");
        rockSongs.add("Stairway to Heaven - Led Zeppelin");
        rockSongs.add("Hotel California - Eagles");
        rockSongs.add("Sweet Child O' Mine - Guns N' Roses");
        rockSongs.add("Imagine - John Lennon");
        rockSongs.add("One - Metallica");
        rockSongs.add("Fear Of The Dark - Iron Maiden");
        rockSongs.add("Thunderstruck - AC/DC");
        rockSongs.add("Hells Bells - AC/DC");
        rockSongs.add("Thunder - AC/DC");
        rockSongs.add("The Trooper - Iron Maiden");
        rockSongs.add("Last Resort - Papa Roach");
        rockSongs.add("Left Outside Alone - Blind Channel");
        rockSongs.add("Dark Side - Blind Channel");
        rockSongs.add("We Are No Saints - Blind Channel");
        rockSongs.add("Careless Whisper - Kiara Rocks,Sebastian Bach");
        rockSongs.add("The Pretender - Foo Fighters");
        rockSongs.add("Seven Nation Army - The White Stripes");
        rockSongs.add("Holiday - Green Day");
        rockSongs.add("Supermassive Black Hole - Muse");
        rockSongs.add("Get Free - The Vines");
        rockSongs.add("Lost İn The Echo - Linkin Park");
        rockSongs.add("Hysteria - Muse");
        rockSongs.add("Fake It - Seether");
        rockSongs.add("With You - Linkin Park");
        rockSongs.add("End Of Me - Ashes Remain");
        rockSongs.add("Nothing Else Matters - Mettalica");
        rockSongs.add("Shoot To Thrill - AC/DC");
        rockSongs.add("Sweet Dreams - Mariln Manson");
        rockSongs.add("Sex on Fire - Kings Of Leon");
        rockSongs.add("Smells Like Teen Spirit - Nirvana");
        rockSongs.add("Ace of Spades - Motörhead");
        rockSongs.add("Overkill - Motörhead");
        rockSongs.add("Love Bites(So Do I) - Halestorm");
        rockSongs.add("Modern Day Cowboy - Tesla");
        rockSongs.add("Fighting The World - Manowar");
        rockSongs.add("Numbers(I Can Only Count to Four - Phychostick");
        rockSongs.add("Since You Been Gone - Rainbow");
        rockSongs.add("Riot - Three Days Grace");
        rockSongs.add("What it Takes - Adelitas Way");
        rockSongs.add("Blinded - As I Lay Dying");
        rockSongs.add("Over And Under - Egypt Central");
        rockSongs.add("Perry Mason - Ozzy Osbourne");
        rockSongs.add("Monster Made of Memories - Citizen");
        rockSongs.add("Break - Three Days Grace");
        rockSongs.add("The World is Burning");
        rockSongs.add("Cyberhex - Motionless In White");
        rockSongs.add("Rockstor - Blue Stahli");
        rockSongs.add("...To Be Loved - Papa Roach");
        rockSongs.add("Save Yourslef - My Darkest Days");
        rockSongs.add("Digital World - Amaranthe");
        rockSongs.add("Betrayal - Lita Ford");
        rockSongs.add("Cathode Ray Sunshine");
        rockSongs.add("Not Strong Enough - Apocalyptica");
        rockSongs.add("Another Way Out - Hollywood Undead");
        rockSongs.add("How to Survive - Of Mice & Men");
        rockSongs.add("Paranoid - I Prevail");
        rockSongs.add("Born to Be Epic - Equilibrium");
        rockSongs.add("Low - Wage War");
        rockSongs.add("One For the Money - Escape the Fate");
        rockSongs.add("Blood & Water - Memphis May Fire");
        rockSongs.add("Knives - Bullet For My Valentine");
        rockSongs.add("Brush the Dust Away - In Flames");
        rockSongs.add("Du hast - Rammstein");
        rockSongs.add("Die, Die My Darling - Metallica");
        rockSongs.add("Fell So Numb - Rob Zombie");
        rockSongs.add("Living The Dream - Five Finger Death Punch");

        super.setSongs(rockSongs);     // arreylist'i super sınıfın (Songs sınıfı) arreylistine atar

    }
}