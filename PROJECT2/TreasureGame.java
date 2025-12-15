/** 
 * Lead Author(s): 
 * Damiam Alfaro; dalfaro@student.sdccd.edu 
 * <<Add additional lead authors here>> 
 * 
 * Other Contributors: 
 * Full name; student ID or contact information if not in class 
 * <<Add additional contributors (mentors, tutors, friends) here, with contact information>> 
 * 
 * References: 
 * Gaddis, T. (2023). Starting out with Java: From control structures through objects. Pearson. 
 * <<Add more references here>> 
 * 
 * Version: December 14, 2025
 */

// A treasure game has the packages to initiate the GUI
import javax.swing.*;
import java.awt.*;

public class TreasureGame {

    // A treasure game has a 5 sized board
    private static final int BOARD_SIZE = 5;
    
    // A treasure game has a total of 10 treasures
    private static final int TOTAL_TREASURES = 10;
    
    // A treasure game has a total number of trolls
    private static final int TOTAL_TROLLS = 7;
    
    // A treasure game has a total of 20 maximum tries
    private static final int MAX_TRIES = 20;

    // A treasure game has a frame
    private JFrame frame;
    
    // A treasure game has a board panel
    private JPanel boardPanel;
    
    // A treasure game has a left label section display
    private JLabel treasuresLeftLabel;
    
    // A treasure game has found label section display
    private JLabel treasuresFoundLabel;
    
    // A treasure game has a tries count section display
    private JLabel triesLeftLabel;
    
    // A treasure game has a status label section display
    private JLabel statusLabel;

    // A treasure game has an array of buttons
    private EmptyButton[] buttons;
    
    // A treasure game has a count of the total treasures left
    private int treasuresLeft;
    
    // A treasure game has a count of the total treasures found
    private int treasuresFound;
    
    // A treasure game has a count of the total tries left
    private int triesLeft;
    
    // A treasure game shows whether a game is over or ongoing
    private boolean gameOver;

    // A treasure game has a TreasurerGame constructor to initiate the game
    public TreasureGame() {
        
        // A treasure game constructor takes the count of the total treasures
        this.treasuresLeft = TOTAL_TREASURES;
        
        // A treasure game constructor takes the count of the total treasures found
        this.treasuresFound = 0;
        
        // A treasure game constructor takes the count of the total maximum available tries
        this.triesLeft = MAX_TRIES;
        
        // A treasure game constructor takes the status of the game
        this.gameOver = false;
        
        // A treasure game constructor initiates the GUI
        createAndShowGUI();
    }

    // A treasure game uses a constructor to initiate the play
    public void play() {
        
        // A treasure game constructor initiates the GUI
        frame.setVisible(true);
    }

    // A treasure game has a constructor for the GUI
    private void createAndShowGUI() {
    
        // A treasure game GUI has a title
        frame = new JFrame("Treasure Hunt Game");
        
        // A treasure game GUI closed the GUI when EXIT_ON_CLOSE is executed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // A treasure game GUI has a layouyt of 10 by 10
        frame.setLayout(new BorderLayout(10, 10));
    
        // A treasure game GUI has a pane to be set up
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
    
        // A treasure game GUI has a title display
        JLabel titleLabel = new JLabel("Treasure Hunt", SwingConstants.CENTER);
        
        // A treasure game GUI has a font type and font size
        titleLabel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 36));
        
        // A treasure game GUI has a border size dimensions
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        frame.add(titleLabel, BorderLayout.NORTH);
    
        // A treasure game GUI has an info panel
        JPanel infoPanel = new JPanel();
        
        // A treasure game GUI gas a grud layout for the information display
        infoPanel.setLayout(new GridLayout(3, 1, 5, 5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20));
    
        // A treasure game GUI has new labels for the treasures left, treasurers found and tries left
        treasuresLeftLabel = new JLabel("Treasures left: " + treasuresLeft);
        treasuresFoundLabel = new JLabel("Treasures found: " + treasuresFound);
        triesLeftLabel = new JLabel("Tries left: " + triesLeft);
    
        // A treasure game GUI has a information panel with different font
        Font infoFont = new Font("Serif", Font.PLAIN, 18);
        treasuresLeftLabel.setFont(infoFont);
        treasuresFoundLabel.setFont(infoFont);
        triesLeftLabel.setFont(infoFont);
    
        // A treasure game GUI adds the treasurer and attempts left display to the information panel
        infoPanel.add(treasuresLeftLabel);
        infoPanel.add(treasuresFoundLabel);
        infoPanel.add(triesLeftLabel);
        frame.add(infoPanel, BorderLayout.WEST);
    
        // A treasure game GUI has a grid layout of 5 by 5 to let the user choose the next possible treasure square
        boardPanel = new JPanel();
        
        // A treasure game GUI adds the layout of 5 by 5
        boardPanel.setLayout(new GridLayout(5, 5));
        
        // A treasure game GUI sets the board panel onto the empty border
        boardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(boardPanel, BorderLayout.CENTER);
    
        // A treasure game GUI has the board buttons for the user to click
        createBoardButtons();
    
        // A treasure game GUI shows when the last move is coming
        // and assignes a respective font and empty border
        statusLabel = new JLabel("Last move: ", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
        frame.add(statusLabel, BorderLayout.SOUTH);
    
        // A treasure game GUI has a framing size of 700 - 500
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    // A treasure game GUI has a constructor dedicated for the board buttons
    // for the user to click on
    private void createBoardButtons() {
        
        // A treasure game GUI display board has a size designated at the beginning
        int totalButtons = BOARD_SIZE * BOARD_SIZE;
        buttons = new EmptyButton[totalButtons];

        // A treasure game GUI randomly assigns the locations of the treasures
        java.util.Random random = new java.util.Random();
        
        // A treasure game GUI has a total of treasures placed
        int treasuresPlaced = 0;

        // A treasure game GUI has a place TreasureButtons randomly in the array
        while (treasuresPlaced < TOTAL_TREASURES) {
            int location = random.nextInt(totalButtons);
            if (buttons[location] == null) {
                TreasureButton treasureButton = new TreasureButton();
                buttons[location] = treasureButton;
                TreasureButtonListener listener =
                        new TreasureButtonListener(this, treasureButton);
                treasureButton.addActionListener(listener);
                treasuresPlaced++;
            }
        
        }
        
        // A treasure game has a numbe rof trolls placed
        int trollsPlaced = 0;
        while (trollsPlaced < TOTAL_TROLLS) {
            int location = random.nextInt(totalButtons);
            if (buttons[location] == null) {
                TrollButton trollButton = new TrollButton();
                buttons[location] = trollButton;
                TrollButtonListener listener =
                        new TrollButtonListener(this, trollButton);
                trollButton.addActionListener(listener);
                trollsPlaced++;
            }
        }

        // A treasure game GUI has remaining null spots with EmptyButtons
        for (int i = 0; i < totalButtons; i++) {
            
            // A treasure game GUI starts empty button if not yet started
            if (buttons[i] == null) {
                EmptyButton emptyButton = new EmptyButton();
                buttons[i] = emptyButton;
                // A treasure game GUI imports the empty button listener
                EmptyButtonListener listener =
                        new EmptyButtonListener(this, emptyButton);
                emptyButton.addActionListener(listener);
            }
        }

        // // A treasure game GUI adds buttons to the board panel
        for (int i = 0; i < totalButtons; i++) {
            boardPanel.add(buttons[i]);
        }
    }

    // A treasure game GUI decreases the number of tries left per valid click
    // and updates the label
    public void reduceNumberOfTries() {
        
        // A treasure returns nothing if the game is over
        if (gameOver) {
            return;
        }
        
        // A treasure game GUI Displays the tries left
        if (triesLeft > 0) {
            triesLeft--;
            triesLeftLabel.setText("Tries Left: " + triesLeft);

            // A treasure game GUI displays the final message if the tries run out
            if (triesLeft == 0) {
                statusLabel.setText("No more tries! Revealing all treasures...");
                endGame();
            }
        }
    }

    // A treasure game GUI displays a message if a treasure is found
    public void foundTreasure() {
        if (gameOver) {
            return;
        }

        // A treasure game GUI adds the count for each treasure found
        treasuresFound++;
        
        // A treasure game GUI reduces the count of the treasures left
        treasuresLeft--;

        // A treasure game GUI displays when a treasure is individually found
        treasuresFoundLabel.setText("Treasures Found: " + treasuresFound);
        treasuresLeftLabel.setText("Treasures Left: " + treasuresLeft);
        statusLabel.setText("You found a treasure!");

        // A treasure game GUI displays a winning message after all treasures
        // are found
        if (treasuresLeft == 0) {
            statusLabel.setText("You found all the treasures! You win!");
            endGame();
        }
    }

    // A treasure game GUI displays a message if a treasure is not clicked
    public void foundNothing() {
        if (gameOver) {
            return;
        }
        statusLabel.setText("Nothing here... keep looking!");
    }
    
    // NEW CODE: A TREASURE GAME GUI DISPLAYS A MESSAGE AND RESETS TREASURE COUNTS WHEN A TROLL IS CLICKED
    public void foundTroll() {
        if (gameOver) {
            return;
        }

        // NEW CODE: A TROLL TAKES AWAY ALL YOUR TREASURE BUT THE GAME GOES ON
        treasuresFound = 0;
        treasuresLeft = TOTAL_TREASURES;

        // NEW CODE: UPDATE THE LABELS AFTER THE TROLL TAKES YOUR TREASURE
        treasuresFoundLabel.setText("Treasures Found: " + treasuresFound);
        treasuresLeftLabel.setText("Treasures Left: " + treasuresLeft);

        // NEW CODE: UPDATE THE STATUS MESSAGE FOR THE LAST MOVE
        statusLabel.setText("A troll stole all your treasure!");
    }

    // A treasure game GUI ends the game as a boolean
    public boolean isGameOver() {
        return gameOver;
    }

    // A treasure game GUI constructor to end the game
    public void endGame() {
        gameOver = true;

        // A treasure game GUI implements the click on each button
        for (int i = 0; i < buttons.length; i++) {
            EmptyButton button = buttons[i];
            if (button.isTreasure()) {
                // Reveal all treasures at game over
                button.reveal();
            } else {
                // Disable empty buttons so they cannot be clicked
                button.setEnabled(false);
            }
        }
        
        // NEW CODE: REVEAL ALL TROLLS AT GAME OVER
        for (int i = 0; i < buttons.length; i++) {
            EmptyButton button = buttons[i];
            if (button.isTroll()) {
                button.reveal();
            }
        }
    }

    // A treasure game constructor to start playing
    public static void main(String[] args) {
        new TreasureGame().play();
    }
}