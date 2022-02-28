package New;

public class Puzzle4 {
    public static void main (String [] args) {
        Puzzle4b [] orbs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            orbs[x] = new Puzzle4b();
            orbs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0){
            x = x - 1;
            result = result + orbs[x].doStuff(x);
        }
        System.out.println("результат" + result);
    }
}
class Puzzle4b {
    int ivar;
    public int doStuff (int factor) {
        if (ivar > 100) {
            return ivar * factor;
        }
        else {
            return ivar * (5 - factor);
        }
    }
}