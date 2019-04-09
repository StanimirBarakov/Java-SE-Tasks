public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(String message) {
        super(message);
    }
    public InvalidSongLengthException() {
        super("Artist name should be between 3 and 20 symbols.");
    }
}
