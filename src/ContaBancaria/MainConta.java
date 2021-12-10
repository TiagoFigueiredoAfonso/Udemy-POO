package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double valor = 0;    
        Cliente c1;

        System.out.println("Nome: ");
        String nome = leia.next();
        
        System.out.println("Número conta: ");
        int numeroConta = leia.nextInt();
       
        System.out.println("Existe valor de depósito inicial(s/n)? ");
        String resposta = leia.next();
        // char resposta = leia.next().charAt(0);

        if (resposta.equals("s")) {
            System.out.println("Valor Depósito: ");
            valor = leia.nextDouble();
            c1 = new Cliente(nome, numeroConta, valor);
           
        }else {
            c1 = new Cliente(nome, numeroConta);
            // retorno vazio, caso o usuário digite 'não'
        }
        

        c1.Saida();            

        System.out.println("\nEntre com o valor do depósito: ");
        valor = leia.nextDouble();
        c1.depositoConta(valor);
        
        c1.Saida();

        System.out.println("\nSaque um valor da Conta: ");
        valor = leia.nextDouble();
        c1.saqueConta(valor);

        c1.Saida();
        
        leia.close();
    }
}
