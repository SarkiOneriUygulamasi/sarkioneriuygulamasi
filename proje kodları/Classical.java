// Classical türüne ait sınıf
import java.util.ArrayList;

class Classical extends Songs {
    // Classical türünde şarkıları içeren arreylist
    ArrayList<String> classicalSongs = new ArrayList<>();

    // Classical sınıfının constructor metodu ile arreylist'e şarkı ekler
    public Classical() {
        //41 adet şarkı eklendi
        classicalSongs.add("Symphony No. 5 - Ludwig van Beethoven");
        classicalSongs.add("Moonlight Sonata - Ludwig van Beethoven");
        classicalSongs.add("Canon in D Major - Johann Pachelbel");
        classicalSongs.add("Clair de Lune - Claude Debussy");
        classicalSongs.add("Rhapsody on a Theme of Paganini - Sergei Rachmaninoff");
        classicalSongs.add("The Four Seasons - Antonio Vivaldi");
        classicalSongs.add("Piano Concerto No. 21 - Wolfgang Amadeus Mozart");
        classicalSongs.add("Experiance - Ludovico Einaudi");
        classicalSongs.add("The Valkyrie: Ride of the Valkyries - Richard Wagner");
        classicalSongs.add("Peer Gynt Suite - Edvard Grieg");
        classicalSongs.add("Adagio for Strings - Samuel Barber");
        classicalSongs.add("Nocturne No. 2 -  Nocturne No. 2 ");
        classicalSongs.add("Carl Orff – Carmina Burana: O fortuna");
        classicalSongs.add("The Planets – Gustav Holst");
        classicalSongs.add("Suite bergamasque - Claude Debussy");
        classicalSongs.add("Nabucco - Guiseppe Verdi");
        classicalSongs.add("Brandenburg Concerto - Johann Sebastian Bach");
        classicalSongs.add("Thaïs: Meditation - Jules Massenet");
        classicalSongs.add("On the Beautiful Blue Danube - Johann Strauss II");
        classicalSongs.add("Hungarian Dance - Johannes Brahms ");
        classicalSongs.add("Swan Lake - Pyotr Ilyich Tchaikovsky");
        classicalSongs.add("Gymnopédie No. 1 - Erik Satie");
        classicalSongs.add("Requiem, K. 626 - Wolfgang Amadeus Mozart");
        classicalSongs.add("Bagatelle in A minor - Ludwig van Beethoven");
        classicalSongs.add("Pomp and Circumstance - Edward Elgar");
        classicalSongs.add("Carmen Suite - Georges Bizet");
        classicalSongs.add("Symphony No. 9 in D minor - Ludwig Van Beethoven");
        classicalSongs.add("The Tales of Hoffmann - Jacques Offenbach");
        classicalSongs.add("Acques Offenbach - Remo Giazotto");
        classicalSongs.add("Serenade No. 13 - Wolfgang Amadeus Mozart");
        classicalSongs.add("The Barber of Seville - Gioachino Rossini");
        classicalSongs.add("Piano Sonata No. 14 - Ludwig van Beethoven");
        classicalSongs.add("Má Vlast (My Fatherland) - Bedřich Smetana");
        classicalSongs.add("String Quintet in E major - Luigi Boccherini");
        classicalSongs.add("Symphony No. 40 - Wolfganag Amadeus Mozart");
        classicalSongs.add("Slavonic Dance No. 2 - Antonín Dvořák");
        classicalSongs.add("Ave Maria - Charles Gounod");
        classicalSongs.add("Nothing Else Matters - Apocalyptica");
        classicalSongs.add("12 Violin Concertos - Antonio Vivaldi");
        classicalSongs.add("Beethoven 5th - Apocalyptica");
        classicalSongs.add("The Rise of Sodom and Gomorrah - Therion");

        super.setSongs(classicalSongs);   // arreylist'i super sınıfın (Songs sınıfı) arreylistine atar

    }
}