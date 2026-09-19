
package Week7AssignmentProblems;

class PlaylistAssignment {
    private final String[] songs;
    private int songCount;

    PlaylistAssignment(int maxSongs) {
        songs = new String[maxSongs];
        songCount = 0;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    public String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++)
            copy[i] = songs[i];

        return copy;
    }

    public int getSongCount() {
        return songCount;
    }
}

public class Week7A2Playlist {
    public static void main(String[] args) {
        PlaylistAssignment p = new PlaylistAssignment(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("First song: " + p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());
    }
}