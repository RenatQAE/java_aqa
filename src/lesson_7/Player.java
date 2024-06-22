package lesson_7;

import java.util.Objects;

public class Player {

    private String nickname;
    private int id;
    private boolean isOnline;

    public Player(String nickname, boolean isOnline, int id) {
        this.nickname = nickname;
        this.isOnline = isOnline;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }



    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", id=" + id +
                ", isOnline=" + isOnline +
                '}';
    }
}

