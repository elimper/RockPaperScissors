import java.util.Random;

/**
 * generates the players for the Rock paper scissors game
 * 
 * @author Eli Limper 
 * @version 8/19/2020
 */
public class Player {
    private String name;
    private String choice;
    private Random random = new Random();
    private String[] options = {"rock", "paper", "scissors"};
    
    public Player(){
        
    }
    
    public Player(String person){
        name = person;
    }
    
    public String computerChoice(){
        int i = random.nextInt(3);
        return options[i];
    }
    
    public void setChoice(String selection){
        choice = selection;
    }
    
    public void setName(String individual){
        name = individual;
    }
    public String[] getOptions(){
        return options;
    }
    public String getName(){
        return name;
    }
    public String getChoice(){
        return choice;
    }

}
