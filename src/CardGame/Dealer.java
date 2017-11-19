package CardGame;

import java.util.Iterator;
import java.util.List;

public class Dealer {

    private List<Card> dcards;
    private Gamer player1;
    private Gamer player2;

    public Dealer(List<Card> dcards, Gamer player1, Gamer player2) {
        this.dcards = dcards;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void bajanel() {
        int k = 0;
        List<Card> list1 = dcards.subList(dcards.size() / 2, dcards.size() - 1);
        List<Card> list = dcards.subList(0, dcards.size() / 2 - 1);
        player1.setGcards(list);
        player2.setGcards(list1);
    }


    public void show() {
        System.out.print(player1.getName() + "| ");
        for (Card x : player1.getGcards())
            System.out.print(x.getMast() + "i " + x.getType() + " ");
        System.out.println();

        System.out.print(player2.getName() + "| ");
        for (Card x : player2.getGcards())
            System.out.print(x.getMast() + "i " + x.getType() + " ");
        System.out.println();
    }

    public void deleteCard(Card e, Gamer player) {
        Iterator<Card> it = player.getGcards().iterator();
        while (it.hasNext()) {
            if (it.next().equals(e))
                it.remove();
        }

    }

    public void startGame() {

        System.out.println("Game started:");

        move();

        System.out.println();
        System.out.println(player1.getScore());
        System.out.println(player2.getScore());

        if (player1.getScore() == player2.getScore()) {
            System.out.println("Nicha");
            return;
        }
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " winner");
            return;
        } else {
            System.out.println(player2.getName() + " winner");
            return;
        }

    }

    private void move() {
        int k = 0;
        int p = 0, l = 0, p1Score = 0, p2Score = 0;
        int j = 0;
        Card card1, card2;
        while (j != player1.getGcards().size()) {
            card1 = player1.getGcards().get(k++);
            System.out.println(player1.getName() + " gcec " + card1.getMast() + "i " + card1.getType() + " ");
            player1.cardGcec(card1);
            if (card1.getType() == "Carol") card1.setValue(4);
            if (card1.getType() == "Valet") card1.setValue(2);
            if (card1.getType() == "Dama") card1.setValue(3);
            if (card1.getType() == "Tuz") card1.setValue(10);
            if (card1.getType() == "6" || card1.getType() == "6" || card1.getType() == "8" || card1.getType() == "9" || card1.getType() == "10" || card1.getType() == "7")
                card1.setValue(0);
            j++;

            while (p != player2.getGcards().size()) {
                card2 = player2.getGcards().get(l++);
                System.out.println(player2.getName() + " gcec " + card2.getMast() + "i " + card2.getType() + " ");
                player2.cardGcec(card2);
                if (card2.getType() == "Carol") card2.setValue(4);
                if (card2.getType() == "Valet") card2.setValue(2);
                if (card2.getType() == "Dama") card2.setValue(3);
                if (card2.getType() == "Tuz") card2.setValue(10);
                if (card2.getType() == "6" || card2.getType() == "6" || card2.getType() == "8" || card2.getType() == "9" || card2.getType() == "10" || card2.getType() == "7")
                    card2.setValue(0);
                p++;
                if (card1.getValue() > card2.getValue()) {
                    p1Score = p1Score + card1.getValue() + card2.getValue();
                    player1.setScore(p1Score);
                } else {
                    p2Score = p2Score + card1.getValue() + card2.getValue();
                    player2.setScore(p2Score);
                }
                break;
            }

        }

    }


}



    /*                 MAIN              */
    /*    List<Card> cards = new ArrayList<>();
        String[] masts = {"qyap", "khach", "ghar", "sirt", "qyap", "khach", "ghar", "sirt", "qyap"};
        String[] types = {"Carol", "Dama", "Valet", "Tuz", "6", "7", "8", "9", "10"};
        Random tiv = new Random();
        for (int i = 0; i <= 33; i++) {
            int j = tiv.nextInt(masts.length);
            cards.add(new Card(masts[j], types[j]));
        }

        Gamer player1 = new Gamer("Player 1");
        Gamer player2 = new Gamer("Player 2");

        Dealer dealer = new Dealer(cards, player1, player2);
        dealer.bajanel();
        dealer.show();
        dealer.startGame();    */





