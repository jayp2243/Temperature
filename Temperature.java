
/**
 * Temperature Object.
 * 
 * @author JAYMIN PATEL
 */
public class Temperature {
    
    double ftemp;
    
    
    public double ftemp(){
        //initialize ftemp to 1
        return ftemp = 1;
    }
    
    public double setTemperature(double stemp){
        //sets user input to ftemp
        ftemp = stemp;
        return ftemp;
    }
    public double getTemperature(){
        //returns Fahrenheit
        return ftemp;
        
    }
    
    public double toCelsius(){
        //formula F to C
        double cels = (5.00/9.00) * (ftemp - 32.00);
        return cels;
        
        
    }
    
    public double toKelvin(){
        //Formula F to K
        double kelv =  ((5.00/9.00) * (ftemp - 32.00)) + 273.00;
        return kelv;
        
    }
}
