package com.company;

public class playernode {
    private Player player;
    private playernode nextplayer;

    public playernode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public playernode getNextplayer() {
        return nextplayer;
    }

    public void setNextplayer(playernode nextplayer) {
        this.nextplayer = nextplayer;
    }
}
