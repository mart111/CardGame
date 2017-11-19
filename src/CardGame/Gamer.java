package CardGame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gamer {

    private String name;
    private List<Card> gcards = new ArrayList<>();
    private int score;

    public Gamer() {
    }

    public Gamer(String name) {
        this.name = name;
    }


    public List<Card> getGcards() {
        return gcards;
    }

    public String getName() {
        return name;
    }

    public void setGcards(List<Card> gcards) {
        this.gcards = gcards;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void cardGcec(Card e) {
        int k = this.gcards.indexOf(e);
        gcards.get(k);
    }

}
