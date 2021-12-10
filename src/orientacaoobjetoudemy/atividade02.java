
package orientacaoobjetoudemy;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        classeAtividade02 info = new classeAtividade02();
        
        System.out.println("Nome: ");
        info.nome = leia.nextLine();
        System.out.println("Salário Bruto: ");
        info.salarioBruto = leia.nextDouble();
        System.out.println("Imposto: ");
        info.imposto = leia.nextDouble();
        
        System.out.println("Funcionário: " + info.toString() );
        
        System.out.println();
        
        System.out.println("Qual a porcentagem de aumento? ");
        double aumento = leia.nextDouble();
        info.aumentarSalario(aumento);
        
        System.out.println("Dados Atualizados: " + info.toString2());
        
        leia.close();
    }
            
}
