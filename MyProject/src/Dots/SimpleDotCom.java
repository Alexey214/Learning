package Dots;

public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;

public String checkYourself (String stringGuess){
    int guess = Integer.parseInt(stringGuess);
    String result = "Miss";
        for (int cell : locationCells){
            if (guess == cell){
                result = "Good";
                numOfHits++;
                break;
            }
        }
    if (numOfHits == locationCells.length) {
        result = "Kill";
    }
    System.out.println (result);
    return result;
}

public void setLocationCells(int[] locs){
    locationCells = locs;
}

}
