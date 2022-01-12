import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song currentSong = songs.get(i);
            if (currentSong.getTitle() == title)
                return currentSong;
        }
        return null;
    }

    public boolean addSong(String newSongTitle, double newSongDuration) {
        if (findSong(newSongTitle) == null) {
            songs.add(new Song(newSongTitle,newSongDuration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        System.out.println(songs.size() + ", " + trackNumber);
        if ((trackNumber-1) >= songs.size() || (trackNumber-1) < 0)
            return false;
        Song addSong = songs.get(trackNumber-1);
        playlist.add(addSong);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song addSong = findSong(title);
        if (addSong != null) {
            playlist.add(addSong);
            return true;
        }
        return false;
    }
}
