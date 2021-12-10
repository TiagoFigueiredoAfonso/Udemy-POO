/*
 - Membros Estáticos - Tbm são chamados de membros da classe
 - Não precisam de objeto para serem chamados, sao chamados a partir do proprio nome da classe
*/
/*
Problema
Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferencia e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais
*/
/*
Versão 1 - Métodos na própria classe do programa
Versão 2 - classe Calculator com membros de instância
Versão 3 - classe Calculator com método estático
*/
package metodosEstaticos;
// VERSÃO 2

import java.util.Scanner;


public class Main02 {
   
    // final para indicar uma constante e LETRAS MAIUSCULAS, padrão! com underline se precisar
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Calculator02 cal = new Calculator02();
        
        System.out.print("Entre com o raio: ");
        double raio = leia.nextDouble();
        
        double c = cal.circunferencia(raio);
        
        double v = cal.volume(raio);
        
        System.out.printf("Circunferência: %.2f" , c);
        System.out.printf("\nVolume: %.2f " , v);
        System.out.printf("\nPI: %.2f " , cal.PI);
    }

    private static class Calculator {

        public Calculator() {
        }
    }
    
    
    
}
