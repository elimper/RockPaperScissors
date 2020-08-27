import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

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
    private JButton scissors
    private JLabel computerChoice;
    private JLabel score;
    private int computerScore = 0;
    private int humanScore = 0;
    
    public GuiGame(){
        super("Rock, Paper, Scissors");
        setLayout(new FlowLayout());
        
        score = new JLabel("Human: " + humanScore + "     Computer: " + computerScore);
        
        computerChoice = new JLabel("The computer will display its selection here");
        add(computerChoice);
        
        rock = new JButton("Rock");
        paper = new JButton("Paper");
        scissors = new JButton("Scissors");
        add(rock);
        add(paper);
        add(scissors);
        
    }
}
