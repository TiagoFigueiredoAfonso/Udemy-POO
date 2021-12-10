/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe01SemObjeto;

import java.util.Scanner;

public class Main73 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Qual o preço do dollar? ");
        double dolar = leia.nextDouble();
        
        System.out.print("Quantos dólares gostaria de comprar? ");
        double qtd = leia.nextDouble();
        
        double convertido = class73.conversor(dolar, qtd);
        
        System.out.printf("Montante pago: %.2f" , convertido);
    }
}
