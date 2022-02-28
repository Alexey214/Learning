package DotsV2;
import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame (){
        DotCom one = new DotCom();
        one.setName("Meta.com");
        DotCom two = new DotCom();
        two.setName("VTBX");
        DotCom three = new DotCom();
        three.setName("VTBB");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Ваша цель - три объекта!!!");
        System.out.println("Meta.com"+", "+"VTBX"+", "+"VTBB");
        System.out.println("Попытайся потопить их за минимальное количество ходов!");

        for (DotCom dotComToSet:dotComsList){
            ArrayList<String> newLocation=helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuess= helper.getUserInput("Сделай ход");
            checkUserGuess (userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result="Мимо";
        for (DotCom dotComToTest:dotComsList){
            result=dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("Все цели ушли ко дну!!!");
        if (numOfGuesses<=18){
            System.out.println("Это заняло у вас: "+numOfGuesses+" попыток.");
            System.out.println("Смело кричите: ПРОЩАЙТЕ МОИ ИНВЕСТИЦИИ!!!");
        }
        else {
            System.out.println("Это заняло у вас довольно много времени. "+numOfGuesses+" попыток");
            System.out.println("Смело кричите: ПРОЩАЙТЕ МОИ ИНВЕСТИЦИИ!!!");
        }
    }
    public static void main (String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
