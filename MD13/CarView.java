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
 * Version: November 23, 2025
 */ 

// This class purpose is to show the GUI for the car functionality
// so let's import the necessary packages
import javax.swing.*;
import java.awt.*;

// Extend the JFrame, part of the Java Swing functionalities
public class CarView extends JFrame {
    
    // MD13 OPTIONAL: Implement a picture for each button
    ImageIcon myButton = new ImageIcon("button_picture.png");

    // Import the Car class from Car into CarView
    // a car has a car instance
    private Car car;

    // JLabel are used to display information within the
    // GUI window to the user. Let's use Jlabel to import the private variables from
    // the class Car
    // carview has jlabels for year model make speed and color
    private JLabel modelYearLabel;
    private JLabel makeLabel;
    private JLabel speedLabel;
    private JLabel carColorLabel;
    
    // MD13: I know this is not asked, but when I display the color it displays the RGB value.
    // I want to actually display the color to make the GUI look better, more aesthetic. 
    // md13 carview has a color panel for aesthetic display
    private JPanel colorPanel;   
    
    // MD13: Let's also add along it the select color button
    // md13 carview has a select color button and a color preview panel
    private JButton selectColorButton;
    private JPanel colorPreviewPanel;


    // JTextField allow the user to input information into the GUI display,
    // that being said we can use JTextField to allow the user to input the
    // values for the private variables from Car
    // carview has jtextfield components for model year make speed and color display
    private JTextField modelYearField;
    private JTextField makeField;
    private JTextField speedField;
    private JTextField carColorField;

    // JButton are components that are used to triger functionalities 
    // when clicked or triggered. Let's assign one for the acceleration
    // functionality and one for the brake functionality
    // carview has jbuttons for accelerate and brake operations
    private JButton accelerateButton;
    private JButton brakeButton;
    
    // MD13: Show the speed on a slider with a range of 0 to 100, instead or in addition to a text field
    // Add the speed slider using JSlider functionality
    // md13 carview has a slider to display speed visually
    private JSlider speedSlider;


    // Constructor method to start an instance of the GUI along the Car class
    // carview has a constructor that receives a car object
    public CarView(Car car) {
        
        // car variable within the constructor
        // carview has a car object assigned in constructor
        this.car = car;

        // Assign objects for the text dislplay to the nonmodifiable JLables in the GUI display
        // carview has jlabels describing car attributes
        modelYearLabel = new JLabel("Car Model Year:");
        makeLabel = new JLabel("Car Make:");
        speedLabel = new JLabel("Car Speed:");
        carColorLabel = new JLabel("Car Color:");

        // Assign objects for the text field spaces to allow the user enter his/her values based
        // on the JLabels above. Make sure the user can only input strings, not integers by using
        // String.valueOf. Assign the width of the display column with the 10 number
        // carview has text fields for car attributes
        modelYearField = new JTextField(String.valueOf(car.getYearModel()), 10);
        makeField = new JTextField(car.getMake(), 10);
        speedField = new JTextField(String.valueOf(car.getSpeed()), 10);
        carColorField = new JTextField(String.valueOf(car.getColor()), 10);
        
        // MD13: Add the actual color
        // md13 carview has a color panel that shows the current car color visually
        colorPanel = new JPanel();
        colorPanel.setBackground(car.getColor());
        colorPanel.setPreferredSize(new Dimension(60, 20));
        colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        // MD13: Add the color preview functionality
        // Assign the label to the button color preview
        // md13 carview has the select color button and preview panel
        selectColorButton = new JButton("Select Color", myButton);

        // assign a new panel() instance to the color preview
        // md13 carview has a color preview panel showing the chosen color
        colorPreviewPanel = new JPanel();
        // preview the current color
        colorPreviewPanel.setBackground(car.getColor());
        // assign the dimensions to the preview display
        colorPreviewPanel.setPreferredSize(new Dimension(60, 20));
        // assign a border color to the preview display
        colorPreviewPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        // MD13 Update: We need to make the text fields read only
        // carview has readonly fields for display purposes
        modelYearField.setEditable(false);
        
        // We need to make the text fields read only
        // carview has accelerate and brake buttons with images
        makeField.setEditable(false);
        
        // We need to make the text fields read only
        // md13 carview has a slider that displays the speed
        speedField.setEditable(false);
        
        // We need to make the text fields read only
        carColorField.setEditable(false);

        // Assign objects for the buttons and label each of them
        accelerateButton = new JButton("Accelerate Car", myButton);
        brakeButton = new JButton("Brake Car", myButton);
        
        // MD13: Show the speed on a slider with a range of 0 to 100, instead or in addition to a text field
        // Set the minium display value to 0, the maximum to 100, and car speed as its current position
        speedSlider = new JSlider(0, 100, (int) car.getSpeed());
        
        // assign the major tick marker on the slider display to 20
        speedSlider.setMajorTickSpacing(20);
        
        // assign the major tick marker on the slider display to 5
        speedSlider.setMinorTickSpacing(5);
        
        // display the sticks
        speedSlider.setPaintTicks(true);
        
        // display the labels
        speedSlider.setPaintLabels(true);
        
        // do not allow the user to touch the slider (we don't want them to mess around with it)
        speedSlider.setEnabled(false);
        

        // Assign a grid layout, 4 rows, 2 columns, 10 pixel by 10 pixel in dimensions.
        // The layout below does not contain any of the varibles above, this is just the 
        // layout display.
        // MD13: Since we are adding the slider, we need to make 5 columns, otherwise the GUI looks
        // very ugly. 
        // MD13: Since we are adding the color, let's add a row by making it 7
        // MD13: Since we are previwing the color, let's add another row and make it 9 since we added 
        // two additional rows for the select button and the preview
        // carview has a grid layout for structured gui placement
        setLayout(new GridLayout(9, 2, 10, 10));

        // Once the layout is up, let's upload, or perhaps "add" each of the variables
        // to its display as well. 
        // carview has component additions to the gui
        add(modelYearLabel);
        add(modelYearField);
        add(makeLabel);
        add(makeField);
        // MD13: Add the color
        add(carColorLabel);
        add(carColorField);
        add(new JLabel("Color Preview:"));
        add(colorPanel);
        
        // MD13: Add the color preview section:
        // Allow the user to choose the color
        add(new JLabel("Choose Color:"));
        // once selected, make sure it is executed
        add(selectColorButton);
        
        // show the selected option in the GUI display
        add(new JLabel("Selected Color Preview:"));
        add(colorPreviewPanel);

        add(speedLabel);
        add(speedField);
        add(accelerateButton);
        add(brakeButton);
        
        // MD13: add the functionality slider to the display GUI
        add(speedLabel);
        add(speedField); 
        
        // MD13: Make sure the slider has a title
        add(new JLabel("Speed (Slider):"));
        add(speedSlider); 


        // When the user clicks either the acceleration or brake button, the listener (acceleration 
        // functionality or the brake functionality) has to beexecuted. However, in order to do so,
        // we must import them first respectively from each event listener class into this class.
        // carview has action listeners through composition
        accelerateButton.addActionListener(new AccelerateListener(this, car)); // this is used to apply the event listener to the current CarView
        brakeButton.addActionListener(new BrakeListener(this, car)); // this is used to apply the event listener to the current CarView
        
        // MD13: Create the action listener for the selection of the button. We can use JColorChooser to 
        // display a GUI with a range of colors
        // md13 carview has a lambda listener for color selection
        selectColorButton.addActionListener(e -> {
            
            // MD13: Assign the variables to the display
            
        Color chosen = JColorChooser.showDialog(
            this,
            "Choose a Car Color",
            car.getColor()  
        );
            
            // MD13: Once selected, we can assign the current preview to the new color
            if (chosen != null) {
                
                // Set the current chosen option to the current car color
                car.setColor(chosen);      
                
                // Display the chosen color
                colorPreviewPanel.setBackground(chosen);   
                carColorField.setText("(" + chosen.getRed() + "," 
                                            + chosen.getGreen() + "," 
                                            + chosen.getBlue() + ")");
            }
        });

        // OBSOLOTE: Assign the dimensional display for the GUI, as well as the aesthetic values
        // such as title, size, and visibility. 
        //setTitle("Car Speed Controller");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(300, 200);
        //setLocationRelativeTo(null);
        //setVisible(true);
        
        // MD13 Update: Use pack() instead of setSize(). To do so, we still need to set the title, the default close
        // operation to facilitate functionality, and we can still use setLocationRelativeTo() and setVisible()
        // MD13: Create a menu with an Exit item that shuts down the program.
        // Using the JMenuBar, create a new instance for a menu bar
        // md13 carview has a menu bar with an exit item
        JMenuBar menuBar = new JMenuBar();
        // Title the menu bar
        JMenu fileMenu = new JMenu("File");
        // Assing a value within the menu bar
        JMenuItem exitItem = new JMenuItem("Exit");
        // create an action listener that exits the GUI if the Exit value is clicked
        exitItem.addActionListener(e -> System.exit(0));
        // execute the operation
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        // attach the option to the top left of the gui display
        setJMenuBar(menuBar);

        setTitle("Car Speed Damiam Alfaro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Update the speed concurrently to the actionlistener event when either accelerating or breaking
    public void updateSpeedDisplay() {
        speedField.setText(String.valueOf(car.getSpeed()));
        
        // MD13: Make sure the slider is also concurrently updated
        speedSlider.setValue((int) car.getSpeed());
    }

    // Main method to launch the program
    public static void main(String[] args) {
        // MD13: Add the Color variable as well
        new CarView(new Car(2005, "Tsurito", Color.RED));
    }
}
