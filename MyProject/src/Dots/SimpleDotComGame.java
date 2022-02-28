package Dots;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Insert num");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("Kill")) {
                isAlive = false;
                System.out.println("Вам понадобилось " + numOfGuess + " попыток(и)");
            }
        }
    }
}