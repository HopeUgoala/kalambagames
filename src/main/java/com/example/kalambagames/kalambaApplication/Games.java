package com.example.kalambagames.kalambaApplication;

import javax.persistence.*;

@Entity
@Table
public class Games {


    @Id
    @SequenceGenerator(
            name = "game_sequence",
            sequenceName = "game_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "game_sequence"
    )

    private Long userId;
    private String gameId;
    private String action;

    public Games() {
    }

    public Games(String gameId, String action) {
        this.gameId = gameId;
        this.action = action;
    }

    public Games(Long userId, String gameId, String action) {
        this.userId = userId;
        this.gameId = gameId;
        this.action = action;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Games{" +
                "userId=" + userId +
                ", gameId='" + gameId + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
