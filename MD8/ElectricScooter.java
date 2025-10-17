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
 * Version: October 19, 2025
 */ 

// Create the class of the Electric Scooter
class ElectricScooter {
    
    // Create the private instances for each attribute of the scooter (brand name, color, price-per-hour, speed)
    private String brandName;
    private String scooterColor;
    private double pricePerHour;
    private double scooterSpeed;
    
    // Assign the access constructor of the object within the class in order to be initialized. As indicated
    // in canvas, this constructor takes the brand name and price initially
    public ElectricScooter(String brandName, double pricePerHour) {
        
        // Assign a variable to reference the current object for each of the private instances above,
        // starating with the brandName
        this.brandName = brandName;
        
        // Since the scooter has not been assigned a color yet and the color is not taken in the 
        // constructor, we assign no color to the scooter yet.
        this.scooterColor = "No Color";
        
        // The price per hour is called within this constructor
        this.pricePerHour = pricePerHour;
        
        // Since the speed is not taken in the constructor, and the scooter has not started, we assign
        // a speed of 0.0
        this.scooterSpeed = 0.0;
        
    }
    
    // Implement an accessor for each instance variable above
    public String getBrandName () {
        return this.brandName;
    }
    
    public String getScooterColor() {
        return this.scooterColor;
    }
    
    public double getScooterPricePerHour() {
        return this.pricePerHour;
    }
    
    public double getScooterSpeed() {
        return this.scooterSpeed;
    }
    
    // Implement a mutator method to modify the state scooter color at will. Since we are 
    // not returning any value, only changing, we use void.
    public void changeScooterColor(String newScooterColor) {
        
        // Change the current scooter color to the indicated color
        this.scooterColor = newScooterColor;
    }
    
    // Implement the method to increase speed by 2.5 miles when called
    public void accelerate() {
        
        // Increase the current speed by 2.5 miles
        this.scooterSpeed += 2.5;
    }
    
    // Implement the method to break when the scooter is advancing. Although not asked by canvas,
    // I will implement an if statement to check if the scooter is at 0.0 speed in case this method
    // is called before the accelerate method. 
    public void brake() {
        
        // Check if the scooter has advanced
        if (this.scooterSpeed != 0) {
            
            // If so, reduce its speed when the brake method is called
            this.scooterSpeed -= 2.5;
            
            // If it hasn't advanced, display a message to let the user know
        } else {
            System.out.println("Electric Scooter has not advanced");
        }
        
    }
    
    
    
}