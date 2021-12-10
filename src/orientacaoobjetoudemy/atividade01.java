
package orientacaoobjetoudemy;

import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);
      
        classeAtividade01 retangulo = new classeAtividade01();
        
        System.out.println("Entre com altura e largura: ");
        retangulo.altura = leia.nextDouble();
        retangulo.largura = leia.nextDouble();
        
        System.out.println(retangulo.toString());
    }
    
}
