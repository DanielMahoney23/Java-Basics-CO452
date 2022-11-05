package CW1;

public class Song {
    
    private String title;

    private String artist;
    
    private int timesPlayed;

    public Song(String songname, String artist, int played)
    {
        this.title = songname;
        this.artist = artist;
        this.timesPlayed = played;
    }

    public void print()
    {
        System.out.println(title+ " " +artist+ " " +timesPlayed);
    } 
    public String getsongname() {
        return title;
    }

    public int gettimesplayed() {
        return timesPlayed;
    }
}


