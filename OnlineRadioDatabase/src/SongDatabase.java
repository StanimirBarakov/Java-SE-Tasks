import java.util.ArrayList;
import java.util.List;

public class SongDatabase {

    private List<Song> songs;

    public SongDatabase() {
        songs = new ArrayList<>();
    }
    public void addSong(Song song){
        this.songs.add(song);
        System.out.println("Song added.");
    }
    public String getTotalLengthOfSongs(){
       int totalTime = 0;

        for (Song song : songs) {
            String[] vreme = song.getLength().split(":");
            int minuti = Integer.parseInt(vreme[0]);
            int sekundi = Integer.parseInt(vreme[1]);

            totalTime += minuti*60+sekundi;
        }
        int chas=totalTime/3600;
        int minutes=(totalTime-chas*3600)/60;
        int seconds=(totalTime-chas*3600)%60;

       return "Playlist length: " + chas + "h " + minutes + "m " + seconds + "s";
    }

    public String getSongsAdded() {
        return "Songs added: " + this.songs.size();
    }
}
