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
