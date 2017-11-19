package CardGame;

public class Card {

    private int value;
    private String mast;
    private String type;

    public Card(String mast, String type) {
        this.mast = mast;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMast() {
        return mast;
    }

    public String getType() {
        return type;
    }
}
