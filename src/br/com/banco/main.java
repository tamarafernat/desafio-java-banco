package br.com.banco;

public class main {
    public static void main(String[] args) {
        Cliente Tamara = new Cliente();
        Tamara.setNome("Tamara");

        Conta cc = new ContaCorrente(Tamara);
        Conta poupanca = new ContaPoupanca(Tamara);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
