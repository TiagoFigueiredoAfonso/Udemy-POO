package entities;

/*
Retangule
Width: double
Heigth: double

+ Area(): double
+ Perimetro(): double
+ Diagonal(): double
 */

public class Retangulo {

    public double altura;
    public double largura;

    public double area() {
        return  altura * largura;
       
    }

    public double perimetro() {
        return 2 * (altura + largura);
       
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
        
    }
    public String tostring(){
        return "Area: "
                + area()
                +"\nPerimetro: "
                + perimetro()
                +"\nDiagonal: "
                + diagonal();
    }

}
