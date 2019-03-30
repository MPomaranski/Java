import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Album album1 = new Album("Taco Hemingway - Szprycer");
        Album album2 = new Album("Taco Hemingway - Marmur");
        Album album3 = new Album("TACONAFIDE - SOMA");

        album1.addSong(new Song("Dele", 180));
        album1.addSong(new Song("Karimata", 200));
        album1.addSong(new Song("Nostalgia", 195));
        album1.addSong(new Song("Nostalgia", 195));
        //System.out.println(album1.getSongLinkedList().get(2).toString());

        album2.addSong(new Song("Żyrandol", 183));
        album2.addSong(new Song("Swiecace prostokaty", 204));
        album2.addSong(new Song("Marmur", 295));

        album3.addSong(new Song("Kryptowaluty", 243));
        album3.addSong(new Song("Tamagotchi", 263));
        album3.addSong(new Song("Visa", 183));

        ArrayList<Album> listOfAlbums = new ArrayList<>();
        listOfAlbums.add(album1);
        listOfAlbums.add(album2);
        listOfAlbums.add(album3);

        PlayList playList = new PlayList("My Play List", listOfAlbums);
        playList.addSongToPlayList(new Song("Kryptowaluty", 243));
        playList.addSongToPlayList(new Song("Żyrandol", 183));
        playList.addSongToPlayList(new Song("Dele", 180));
        playList.addSongToPlayList(new Song("8 kobiet", 235));
        playList.addSongToPlayList(new Song("Nostalgia", 195));

        System.out.println(playList);
        System.out.print("\033\143");
        playYourlist(playList);



    }
    public static void playYourlist(PlayList playList){

        ListIterator<Song> iterator = playList.getPlayList().listIterator();

        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        int choose;
        printMenu();

        while (quit){

            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 0:
                    printMenu();
                    break;
                case 1:
                    nextSong(iterator);
                    break;
                case 2:
                    previousSong(iterator);
                    break;
                case 3:
                    replayCurrentSong(iterator);
                    break;
                case 4:
                    addSongToYourPlayList(playList);
                    break;
                case 5:
                    removeSongFromYourPlayList(iterator, playList);
                    break;
                case 6:
                    System.out.println(playList);
                    break;
                case 7:
                    quit = false;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("------------------------------------------");
        System.out.println("Press 0 - to print menu.");
        System.out.println("Press 1 - to next song.");
        System.out.println("Press 2 - to previous song.");
        System.out.println("Press 3 - to replay current song.");
        System.out.println("Press 4 - to add song to your play list.");
        System.out.println("Press 5 - to remove song from play list.");
        System.out.println("Press 6 - to show your play List");
        System.out.println("Press 7 - to quit.");
        System.out.println("------------------------------------------");
    }
    public static void nextSong(Iterator<Song> iterator){
        Song song;
        if(iterator.hasNext()){
            song = iterator.next();
            System.out.println("Actual playing song: " + song);
        }else {
            System.out.println("This is the last song on your play list.");
        }
    }

    public static void previousSong(ListIterator<Song> iterator){
        Song song;
        if(iterator.hasPrevious()){
            song = iterator.previous();
            System.out.println("Actual playing song: " + song);
        }else {
            System.out.println("This is first song on your play list.");
        }
    }
    public static void replayCurrentSong(ListIterator<Song> iterator){
        Song song;
        if(iterator.hasNext()){
            song = iterator.next();
            song = iterator.previous();
            System.out.println("Replay: " + song);
            return;
        }else if(iterator.hasPrevious()){
            song = iterator.previous();
            song = iterator.next();
            System.out.println("Replay: " + song);
            return;
        }else{
            song = iterator.next();
            System.out.println("Replay: " + song);
        }

    }
    public static void removeSongFromYourPlayList(ListIterator<Song> iterator, PlayList playList) {
        if (!playList.getPlayList().isEmpty()) {
            if (iterator.hasNext()) {
                iterator.next();
                iterator.previous();
            } else if (iterator.hasPrevious()) {
                iterator.previous();
                iterator.next();
            } else {
                iterator.next();
            }
            iterator.remove();
            if (iterator.hasNext()) {
                iterator.next();
                return;
            } else if (iterator.hasPrevious()) {
                iterator.previous();
                return;
            } else {
                System.out.println("Removed all songs from play list.");
            }
        } else
            System.out.println("Your list is empty.");
    }
    public static void addSongToYourPlayList(PlayList playList){
        Scanner scanner = new Scanner(System.in);
        String title;
        int duration;
        System.out.println("Give title: ");
        title = scanner.nextLine();
        System.out.println("Give duration: ");
        duration = scanner.nextInt();
        scanner.nextLine();
        if(playList.addSongToPlayList(new Song(title, duration))){
            System.out.println("Song added to play list: " + playList.getName() );
        }
    }
}
