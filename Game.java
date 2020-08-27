import java.util.Scanner;
/**
 * Sets rules for rock paper scissors
 * 
 * @author Eli Limper 
 * @version 8/19/2020
 */
public class Game {
    private Player computer = new Player("computer");
    Player human = new Player();
    private Scanner scanner = new Scanner(System.in);
    private int computerScore = 0;
    private int humanScore = 0;
    
    
    public Game(){
        //Set player name
        createPlayer();
        //begin playing
        System.out.println("Rock, Paper, Scissors, Shoot!");
        //make choice
        human.setChoice(validation());
        //take turn
        takeTurn();
        //run again
        String ans = "y";
        while(ans.equals("y")){
            System.out.println("\nWould you like to take another turn? Enter \"y\" for yes. ");
            ans = scanner.nextLine().toLowerCase();
            if(ans.equals("y")){
                human.setChoice(validation());
                takeTurn();
            }
            else{
                break;
            }
        }
        displayScore();
    }
    
    public void createPlayer(){
        System.out.println("What is your name? ");
        String who = scanner.nextLine();
        human.setName(who);
        System.out.println("Welcome " + human.getName() + "!");
    }
    
    public String validation(){
        String input = "";
        boolean match = false;
        String[] options = human.getOptions();
        //check input against options array. each element gets checked, if a match, return true, break loop
        while(match == false){
            System.out.println("Type rock, paper or scissors.");
            input = scanner.nextLine().toLowerCase();
            for (int i = 0; i < options.length; i++){
                if (options[i].equals(input)){
                    match = true;
                }
            }
        }
        return input;
    }
    
    public void takeTurn(){
        String computerChoice = computer.computerChoice();
        //rules block 
        //same = tie, 
        if( human.getChoice().equals(computerChoice)){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nResult: tie");
        }
        //rock beats scissors, human condition
        if(human.getChoice().equals("rock") && computerChoice.equals("scissors")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nRock crushes scissors \nResult: human wins");
            humanScore++;
        }
        //computer win
        if(human.getChoice().equals("scissors") && computerChoice.equals("rock")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nRock crushes scissors \nResult: computer wins");
            computerScore++;
        }
        //paper beats rock, human wins
        if(human.getChoice().equals("paper") && computerChoice.equals("rock")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nPaper covers rock \nResult: human wins");
            humanScore++;
        }
        //computer wins
        if(human.getChoice().equals("rock") && computerChoice.equals("paper")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nPaper covers rock \nResult: computer wins");
            computerScore++;
        }
        //scissors beats paper, human wins
        if(human.getChoice().equals("scissors") && computerChoice.equals("paper")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nScissors cut paper \nResult: human wins");
            humanScore++;
        }
        //computer wins
        if(human.getChoice().equals("paper") && computerChoice.equals("scissors")){
            System.out.printf("\n%s \t COMPUTER", human.getName());
            System.out.printf("\n%s \t %s", human.getChoice(), computerChoice);
            System.out.printf("\nScissors cut paper \nResult: computer wins");
            computerScore++;
        }
    }
    
    public void displayScore(){
        System.out.println("\nHuman \t COMPUTER");
        System.out.println(humanScore + "\t" + computerScore);
    }
}
