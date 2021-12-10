/*
Classe da Main 02
 */
package metodosEstaticos;

public class Calculator02 {
     public  final double PI = 3.1415;
     
     public double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }
    
    public double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
