import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
* Creates rock, paper scissors in a JFrame environment
*
* @ author: Eli Limper
* @version: 27/08/2020
*/

public class GuiGame {
    private Player computer = new Player("computer");
    Player human = new Player();
    private JButton rock;
    private JButton paper;
    private JButton scissors;
    private JLabel computerChoice;
    private JLabel score;
    private int computerScore = 0;
    private int humanScore = 0;
    private JLabel computerChoice = new JLabel("The computer will display its selection here");
    private JLabel score = new JLabel("Human: " + humanScore + "     Computer: " + computerScore);
    
    public GuiGame(){
        super("Rock, Paper, Scissors");
        setLayout(new FlowLayout());
        
        add(score);
        add(computerChoice);
        
        rock = new JButton("Rock");
        paper = new JButton("Paper");
        scissors = new JButton("Scissors");
        
        Handler handler = new Handler();
        rock.addActionListener(handler);
        paper.addActionListener(handler);
        scissors.addActionListener(handler);
        
        add(rock);
        add(paper);
        add(scissors);
    }
    
    public void takeTurn(){
        String cChoice = computer.computerChoice();
        //rules block 
        //same = tie, 
        if( human.getChoice().equals(cChoice)){
            computerChoice.setText("The computer chose " + cChoice);
            
        }
        //rock beats scissors, human condition
        if(human.getChoice().equals("rock") && cChoice.equals("scissors")){
            computerChoice.setText("The computer chose " + cChoice);
            humanScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
        //computer win
        if(human.getChoice().equals("scissors") && cChoice.equals("rock")){
            computerChoice.setText("The computer chose " + cChoice);
            computerScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
        //paper beats rock, human wins
        if(human.getChoice().equals("paper") && cChoice.equals("rock")){
            computerChoice.setText("The computer chose " + cChoice);
            humanScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
        //computer wins
        if(human.getChoice().equals("rock") && cChoice.equals("paper")){
            computerChoice.setText("The computer chose " + cChoice);
            computerScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
        //scissors beats paper, human wins
        if(human.getChoice().equals("scissors") && cChoice.equals("paper")){
            computerChoice.setText("The computer chose " + cChoice);
            humanScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
        //computer wins
        if(human.getChoice().equals("paper") && cChoice.equals("scissors")){
            computerChoice.setText("The computer chose " + cChoice);
            computerScore++;
            score.setText("Human: " + humanScore + "     Computer: " + computerScore);
        }
    }
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == rock){
                human.setChoice("rock");
                takeTurn();
            }
            else if (e.getSource() == paper){
                human.setChoice("paper");
                takeTurn();
            }
            else if (e.getSource() == scissors){
                human.setChoice("scissors");
                takeTurn();
            }
        }
    }
}
