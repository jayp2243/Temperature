
/**
 * Demonstrates the Temperature class.
 * 
 * @author JAYMIN PATEL
 */
import java.util.Scanner;
 import java.text.DecimalFormat;


public class TemperatureDemo extends Temperature {
   
    public static void main(String[] args) {
        //2 decimal places formatter
        DecimalFormat df = new DecimalFormat("##.##");
        //user input scanner
        Scanner scan = new Scanner(System.in);
        
      //first program instance
        TemperatureDemo res = new TemperatureDemo();
        System.out.println("Enter temperature in Fahrenheit");
        //sets stemp in class temperature to user input
        res.setTemperature(scan.nextDouble());
        System.out.println("Fahrenheit: " + df.format(res.getTemperature()));
        System.out.println("Celsius: " + df.format(res.toCelsius()));
        System.out.println("Kelvin: " + df.format(res.toKelvin()));
        
        
    }
    
}
