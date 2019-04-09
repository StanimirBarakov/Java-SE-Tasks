public class Song {

    private String artistName;
    private String songName;
    private String length;

    public Song(String artistName, String songName, String length) throws InvalidSongException {
        setArtistName(artistName);
        setSongName(songName);
        setLength(length);
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException();
        } else {
            this.artistName = artistName;
        }
    }

    private void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new InvalidSongNameException();
        } else {
            this.songName = songName;
        }
    }

    private void setLength(String length) throws InvalidSongLengthException {
        if(length.length()<3) {
            throw new InvalidSongLengthException();
        }else {
            String[] songLength = length.split(":");
            int minutes = Integer.parseInt(songLength[0]);
            int seconds = Integer.parseInt(songLength[1]);

            if (minutes < 0 || minutes > 14) {
                throw new InvalidSongMinutesException();
            } else if (seconds < 0 || seconds > 59) {
                throw new InvalidSongSecondsException();
            } else {
                this.length = length;
            }
        }

    }

    public String getLength() {
        return length;
    }

}
