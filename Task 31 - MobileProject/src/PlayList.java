import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {

    private String name;
    private LinkedList<Song> playList;
    private ArrayList<Album> ownedAlbums;

    public PlayList(String name, ArrayList<Album> ownedAlbums) {
        this.name = name;
        this.playList = new LinkedList<>();
        this.ownedAlbums = ownedAlbums;
    }

    public boolean addSongToPlayList(Song song){
        Iterator<Song> iterator;
        for(int i = 0; i < getOwnedAlbums().size(); i++ ) {
            Album checkAlbum = getOwnedAlbums().get(i);
            iterator = checkAlbum.getSongLinkedList().iterator();
            while (iterator.hasNext()) {
                Song checkSong = iterator.next();
                if (song.equals(checkSong)) {
                    if(checkIfExist(song)) {
                        getPlayList().add(song);
                        return true;
                    }else{
                        System.out.println("Song already exists in your play list.");
                        return false;
                    }
                }
            }
        }
        System.out.println("You don't owe this song in your albums.");
        return false;
    }

    private boolean checkIfExist(Song song){
        for(int i = 0; i < getPlayList().size(); i++) {
            Song checkSong = getPlayList().get(i);
            if (checkSong.equals(song))
                return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public ArrayList<Album> getOwnedAlbums() {
        return ownedAlbums;
    }

    @Override
    public String toString() {
        String string = "---------------------------------"+"\n"+"List name: " + getName() + "\n"+"---------------------------------"+"\n";
        for (int i = 0 ; i < getPlayList().size(); i++){
            Song song = getPlayList().get(i);
            string += i+1+ ". "+ song.toString()+"\n";
        }
        string += "---------------------------------"+"\n";
        return string;
    }
}
