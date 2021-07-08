
public class Song {

    private String name;
    private int length;

    public Song(String inititalName, int initialLength) {
        this.name = inititalName;
        this.length = initialLength;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }

}
