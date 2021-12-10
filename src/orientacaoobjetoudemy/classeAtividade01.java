
package orientacaoobjetoudemy;

public class classeAtividade01 {
    double largura;
    double altura;
    
    public double area() {
        return largura * altura;
    }
    
    public double perimetro() {
        return 2 * (largura + altura);
    }
    
    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
    
    public String toString() {
        return "Area = " + String.format(" %.2f", area())
                + "\nPerimetro = " + String.format(" %.2f", perimetro())
                + "\nDiagonal = " + String.format(" %.2f" ,diagonal());
    }
}
