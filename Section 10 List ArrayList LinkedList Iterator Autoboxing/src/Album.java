import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs= new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        var iterator=songs.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getTitle().equals(title)){
                return iterator.previous();
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumberOfSong, LinkedList<Song> playList){
        if(trackNumberOfSong-1<0 || trackNumberOfSong-1>songs.size()){
            return false;
        }
        playList.add(songs.get(trackNumberOfSong-1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        if(findSong(title)!=null){
            playList.add(findSong(title));
            return true;
        }
        return false;
    }
}
