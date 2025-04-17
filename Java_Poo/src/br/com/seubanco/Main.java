package br.com.seubanco;

import br.com.seubanco.model.Cliente;
import br.com.seubanco.model.Conta;
import br.com.seubanco.model.ContaCorrente;
import br.com.seubanco.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        // Criando o cliente
        Cliente Barbara = new Cliente();
        Barbara.setNome("Barbara");

        // Criando as contas para o cliente
        Conta cc = new ContaCorrente(Barbara);
        Conta poupanca = new ContaPoupanca(Barbara);

        // Realizando algumas operações
        cc.depositar(100);
        cc.transferir(50, poupanca);

        // Imprimindo extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
