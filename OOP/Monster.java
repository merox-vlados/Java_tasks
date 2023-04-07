package OOP;

public class Monster {

    int eye;
    int hand;

    int leg;

    Monster() {
        this(2,2,2);
    }

    Monster(int quantity) {
        this(quantity,quantity,quantity);
    }

    Monster(int eye, int hand, int leg) {
        this.eye = eye;
        this.hand = hand;
        this.leg = leg;
    }

    void  voice() {
        voice(1,"Grrrrrrrrrr..........");
    }
    void  voice(int count) {
        voice(count,"Grrrrrrrrrr..........");
    }
    void voice(int count, String word) {
        for (int i = 0; i < count; i ++) {
            System.out.println(word);
        }
    }



}
