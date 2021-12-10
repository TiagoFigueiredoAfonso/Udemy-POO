
package exe01SemObjeto;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        
        classEx02 produto = new classEx02();
        System.out.println("Entre com o produto: ");
        System.out.println("Nome: ");
        produto.nome = leia.nextLine();
        System.out.println("Preço: ");
        produto.preco = leia.nextDouble();
        System.out.println("Quantidade: ");
        produto.quantidade = leia.nextInt();
        
        System.out.println("Dados do produto: " + produto);
        
        System.out.println();
        
        System.out.println("Adicione produtos ao estoque: ");
        int quant = leia.nextInt();
        produto.adicionarProduto(quant);
        
        System.out.println();
        
        System.out.println("Dados atualizados: " + produto);
        
        System.out.println();
        
        System.out.println("Saída no Estoque: ");
        quant = leia.nextInt();
        produto.removerProduto(quant);
        
        System.out.println("Saída no Estoque: " + produto);
        
        leia.close();
    }       
}
