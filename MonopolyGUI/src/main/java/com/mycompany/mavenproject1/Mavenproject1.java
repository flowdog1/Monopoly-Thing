import java.awt.*;
import javax.swing.*;



public class MonopolyGUI extends JFrame {
  
  private JButton rollButton;
  private JPanel gameBoardPanel;
  private JLabel playerOneLabel;
  private JLabel playerTwoLabel;
  
  public MonopolyGUI() {
    super("Monopoly");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);
    setResizable(false);
    
    // Initialize components
    rollButton = new JButton("Roll");
    gameBoardPanel = new JPanel();
    playerOneLabel = new JLabel("Player One");
    playerTwoLabel = new JLabel("Player Two");
    
    // Set layout for main frame
    setLayout(new BorderLayout());
    
    // Add components to main frame
    add(rollButton, BorderLayout.NORTH);
    add(gameBoardPanel, BorderLayout.CENTER);
    add(playerOneLabel, BorderLayout.WEST);
    add(playerTwoLabel, BorderLayout.EAST);
    
    // Pack components
    pack();
    
    // Center frame on screen
    setLocationRelativeTo(null);
  }
  
  public static void main(String[] args) {
    // Create instance of MonopolyGUI
    MonopolyGUI gui = new MonopolyGUI();
    
    // Show GUI
    gui.setVisible(true);
  }
}