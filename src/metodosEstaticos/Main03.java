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
// VERSÃO 3

import java.util.Scanner;


public class Main03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
                
        System.out.print("Entre com o raio: ");
        double raio = leia.nextDouble();
        
        double c = Calculator03.circunferencia(raio);
        
        double v = Calculator03.volume(raio);
        
        System.out.printf("Circunferência: %.2f" , c);
        System.out.printf("\nVolume: %.2f " , v);
        System.out.printf("\nPI: %.2f " , Calculator03.PI);
    }
    /*
    insert code - cosntrutor - seleciona gera um construtor
    
    alt insert
    
    botao direito getters e setters
    
    */

       
    
}
