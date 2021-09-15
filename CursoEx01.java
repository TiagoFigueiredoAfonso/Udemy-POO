
package cursoex01;

import entities.Retangulo;
import java.util.Scanner;

/*Fazer um programa para ler os valores da largura e altura de um retangulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado

Retangule
Width: double
Heigth: double

+ Area(): double
+ Perimetro(): double
+ Diagonal(): double
*/
public class CursoEx01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        Retangulo retangle = new Retangulo();
        
        System.out.println("Atura: ");
        retangle.altura = leia.nextDouble();
        System.out.println("Largura: ");
        retangle.largura = leia.nextDouble();
        
        
        System.out.println(retangle.tostring());
    }
    
}
