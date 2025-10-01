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
 * Version: September 28, 2025
 */ 

public class UnitConversions {
    
    // Purpose: Calculate the conversion from miles per hour to kilometers per hour
    // Input/output: Given miles per hour, returns kilometers per hour
    // Examples:
    // milesToKilometersConversion(165) return 265.54
    // milesToKilometersConversion(84) return 135.18
    public static double convertMilesToKilometers(double milesPerHour) {
        // Calculate the kilometers based on the formula Kph = (Mph x 1.609344)
        double kilometersPerHour = milesPerHour * 1.609344;
        
        // Return the conversion to kilometers per hour
        return kilometersPerHour;
    }
    
    
    // Purpose: Calculate the conversion from kilometers per hour to miles per hour
    // Input/output: Given kilometers per hour, returns miles per hour
    // Examples:
    // kilometersToMilesConversion(165) return 102.52
    // kilometersToMilesConversion(84) return 52.19
    public static double convertKilometersToMiles(double kilometersPerHour) {
        // Calculate the miles based on the formula Mph = (Kph x 0.62137)
        double milesPerHour = kilometersPerHour * 0.62137;
        
        // Return the conversion to miles per hour
        return milesPerHour;
    }    

    
    // Purpose: Calculate the conversion from Fahrenheit to Celsius
    // Input/output: Given temperature in Fahrenheit, return temperature in Celsius
    // Examples:
    // fahrenheitToCelsiusConversion(245) return 118.33
    // fahrenheitToCelsiusConversion(162) return 72.22
    public static double convertFahrenheitToCelsius(double fahrenheitTemperature) {
        
        // Calculate the temperature in celsius based on the 
        // formula (Fahrenheit - 32) x 5/9 = Celsius
        double celsiusTemperature = (fahrenheitTemperature - 32) * (5.0/9.0);
        
        // Return the conversion to temperature in celsius
        return celsiusTemperature;
    }
    
    
    // Purpose: Calculate the conversion from Celsius to Fahrenheit
    // Input/output: Given temperature in Celsius, return temperature in Fahrenheit
    // Examples:
    // celsiusToFahrenheitConversion(245) return 473
    // celsiusToFahrenheitConversion(162) return 323.6
    public static double convertCelsiusToFahrenheit(double celsiusTemperature) {
        
        // Calculate the temperature in fahrenheit based on the 
        // formula ((Celsius) x (9.0/5.0)) + 32 = Fahrenheit
        double fahrenheitTemperature = ((celsiusTemperature) * (9.0/5.0)) + 32;
        
        // Return the conversion to temperature in Fahrenheit
        return fahrenheitTemperature;
    }
}