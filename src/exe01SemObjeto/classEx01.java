
package exe01SemObjeto;

public class classEx01 {
    
    public double a;
    public double b;
    public double c;
    
    public double area () {
        
        double p = (a + b + c) / 2; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}