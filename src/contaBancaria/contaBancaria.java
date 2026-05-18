package contaBancaria;

public class contaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    public contaBancaria(int numeroConta,String nome,double valorDepositado){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.depositar(valorDepositado);
    }
    public contaBancaria(int numeroConta,String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }


    public String toString(){
        return String.format("Account %d, Holder: %s, Balance : $%.2f", this.numeroConta,this.nome,this.saldo);
    }

    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }
    public void sacar(double sacar){
        this.saldo = this.saldo - 5.00 -sacar ;
    }

}
