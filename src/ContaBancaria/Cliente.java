package ContaBancaria;

public class Cliente {

    private String nome;
    private int numeroConta;
    private double saldoConta;

    Cliente() {
        // construtor vazio
    }

    Cliente(String nome, int numeroConta, double depositoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        depositoConta(depositoInicial);
    }

    Cliente(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;

    }

    // atualiza conta -> deposito    
    public void depositoConta(double deposito) {
        this.saldoConta += deposito;
    }

    // atualiza conta -> saque
    public void saqueConta(double saque) {
        this.saldoConta -= saque + 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private double getSaldoConta() {
        return saldoConta;
    }

    private void setSaldoConta(double valorDeposito) {
        this.saldoConta = saldoConta;
    }

    public void Saida() {
        System.out.println("Dados da Conta");
        System.out.println("Conta: "
                + getNumeroConta() + ", Cliente: "
                + getNome() + ", Saldo: "
                + String.format("%.2f", this.saldoConta));

    }

}
