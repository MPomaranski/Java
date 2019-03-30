import java.util.Iterator;
import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<Song> songLinkedList;

    public Album(String name){
        this.name = name;
        this.songLinkedList = new LinkedList<>();
    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }

    public boolean addSong(Song song){
        Iterator<Song> i = getSongLinkedList().iterator();
        while (i.hasNext()){
            Song checkSong = i.next();
            if (checkSong.equals(song)) {
                System.out.println("Song already exist in this Album");
                return false;
            }
        }
        getSongLinkedList().add(song);
        System.out.println("Song: " + song + " added.");
        return true;
    }

}
