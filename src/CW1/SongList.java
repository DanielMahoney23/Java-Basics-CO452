package CW1;
import java.util.ArrayList;
import helpers.*; 

public class SongList 
{
        public static void main(String[] args)
        {
            System.out.println(ConsoleColours.CONSOLE_CLEAR);
    
            System.out.println("==================================");
            System.out.println("CO452 Programming Concepts 2022/23");
            System.out.println("==================================");
            System.out.println();
            System.out.println("  CW1 Assessment ");
            System.out.println();
            System.out.println(" by Daniel Mahoney");
            System.out.println();  

            SongList songList = new SongList();
            songList.doMenu();
        }     
    /**
    * This class will allow the user to
    * 
    *  1. Add Song
     *  2. Delete Song
     *  3. Print songs
     *  4. Print top songs
     * 
     * @author: Daniel Mahoney
     */
    private static void displayMenu()
    {
        System.out.println("starting the run");

        System.out.println("1. Add song");
        System.out.println("2. Delete song");
        System.out.println("3. Print song");
        System.out.println("4. print top songs");
        System.out.println("5. quit");
        System.out.println();
        System.out.println(" by Daniel Mahoney");
        System.out.println();  
    }
    
    /**
     * This method will give the user the ability
     * to search for a song by searching for a
     * songs name or artist or the amount of listens 
     * it has
     */
    
    private ArrayList<Song> songList;
    
    public SongList()
    {
        songList = new ArrayList<Song>();
        
        listofsongs();
        doMenu();
    }

    private void listofsongs()
    {
        Song newsonglist = new Song("Major Crimes", "HEALTH", 5788329);
        songList.add(newsonglist);

        newsonglist = new Song("This fffire", "Franz Ferdinand", 13591886);
        songList.add(newsonglist);

        newsonglist = new Song("Murder In My Mind", "Kordhell", 143568390);
        songList.add(newsonglist);
        
        newsonglist = new Song( "Kaikai Kitan", "Eve", 268436884);
        songList.add(newsonglist);

        newsonglist = new Song("PATCHWERK", "Sub Urban", 23942487);
        songList.add(newsonglist);

        newsonglist = new Song("Slow Dancing In The Dark", "Joji", 956561658);
        songList.add(newsonglist);

        newsonglist = new Song("Override", "KSLV Noh", 76480620);
        songList.add(newsonglist);

        newsonglist = new Song("idfc", "blackbear", 613106382);
        songList.add(newsonglist);

        newsonglist = new Song("Toxic", "BoyWithUke", 462603079);
        songList.add(newsonglist);

        newsonglist = new Song("Kick Back", "Kenshi Yonezu", 35677774);
        songList.add(newsonglist);
    }

    //this code adds songs.
    private void addSong()
    
    {
        System.out.println(" Adding a Song");
        String title = InputReader.getString("Please enter a song title >");
        String name = InputReader.getString("Please enter an artist >");
        int count = InputReader.getInt("Please enter play count > ");

        Song song = new Song(title, name, count);
        songList.add(song);
    }

    //deletesong finds song and removes it.

    private void deleteSong()
    {
        printSongs(0);
        Song song = findSong();
        if(song != null){
            songList.remove(song);
        }
        else System.out.println("song not found. ");
        printSongs(0);
    }

    //This findsong is used to delete songs by asking for their name.

    private Song findSong()
    {
        String confirmdelete = InputReader.getString("enter song title >");
        for(Song song : songList)
        {
            if(song.getsongname().contains(confirmdelete))
            return song;
        }
        return null;
    }
    //This bit of code shows the array by using print top songs and times played.

    private void printtimesplayed()

    {
        int timesPlayedAnswer = InputReader.getInt("enter a number of plays and it will display songs with a number of plays higher than your input >");
        printSongs(timesPlayedAnswer);
    }

    //this bit of code shows the songs

    private void printSongs(int timesPlayed)
    {
        System.out.println("\nPrinting Songs\n");

        for(Song song :songList)
        {
            if(song.gettimesplayed()>timesPlayed)
            song.print();
        }
    }
    
    

    public void doMenu() 
    {
        boolean doyouwanttoquit = false;

        while(!doyouwanttoquit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs(0);break;
                case 4: printtimesplayed();break;
                case 5: doyouwanttoquit = true; break;
            }
        }
    }
    
}
