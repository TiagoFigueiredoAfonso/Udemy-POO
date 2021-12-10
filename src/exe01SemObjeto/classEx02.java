
package exe01SemObjeto;

public class classEx02 {
    
    String nome;
    double preco;
    int quantidade;
    
    public double valorTotalEstoque() {
        return preco * quantidade;
    }
    
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    
    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                + String.format("%.2f",valorTotalEstoque());
    }
}
