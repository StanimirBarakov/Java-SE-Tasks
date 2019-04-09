import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Song song = null;
        String artName = "";
        String songName = "";
        String length = "";
        int n = Integer.parseInt(scanner.nextLine());
        SongDatabase songDatabase=new SongDatabase();
        while (n-- > 0) {

            String input = scanner.nextLine();
            String[] tokens = input.split(";");
            artName = tokens[0];
            songName = tokens[1];
            length = tokens[2];

            try {
                String[] vreme = tokens[2].split(":");
                song = new Song(artName, songName, length);

                songDatabase.addSong(song);

            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(songDatabase.getSongsAdded());
        System.out.printf(songDatabase.getTotalLengthOfSongs());

    }
}
