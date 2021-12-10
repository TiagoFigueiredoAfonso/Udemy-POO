
package orientacaoobjetoudemy;

public class classeAtividade02 {
    String nome;
    double salarioBruto;
    double imposto;
    double novoSal;;
    
    public double salarioLiquido() {
        return novoSal = salarioBruto - imposto;
    }
    
    public void aumentarSalario(double porcento) {
        
        novoSal = salarioLiquido() + (salarioBruto * (porcento / 100));
    }
    
    public String toString() {
        return nome + ", " + " $" + String.format("%.2f", salarioLiquido());
    }
     public String toString2() {
        return nome + ", " + " $" + String.format("%.2f",novoSal);
    }
}
