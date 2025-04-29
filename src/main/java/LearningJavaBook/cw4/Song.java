package LearningJavaBook.cw4;

public class Song {;
    String title;
    String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Song() {
    }

    void play(){
        System.out.println("Играю песню "+ title+ " исполнителя "+artist);

    }
}
