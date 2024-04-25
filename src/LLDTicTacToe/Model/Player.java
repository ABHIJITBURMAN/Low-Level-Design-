package LLDTicTacToe.Model;

public class Player {
    public String name;
    public PlayingPeices playingPeices;

    public Player(String name, PlayingPeices playingPeices){
        this.name = name;
        this.playingPeices = playingPeices;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPeices getPlayingPeices() {
        return playingPeices;
    }

    public void setPlayingPeices(PlayingPeices playingPeices) {
        this.playingPeices = playingPeices;
    }
}
