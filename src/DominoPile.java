import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile() {
        pile = new ArrayList();
    }
    public void newStack() {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                Domino sub = new Domino(i,j);
                pile.add(sub);
            }
        }
    }
    public void shuffle() {
        ArrayList<Domino> pile = new ArrayList();
        for (int i = 0; i < this.pile.size();i++) {
            Random rand = new Random();
            int sub = rand.nextInt(this.pile.size());
            pile.add(this.pile.get(sub));
            this.pile.remove(sub);

        }
        this.pile = pile;
    }
}