
package prova1;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Conta> conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new ArrayList<Conta>();
    }

    public void setConta(Conta conta) {
        this.conta.add(conta);
    }

    public void cadastrarConta(double saldo, double limite) {
        Conta novaConta = new Conta(saldo, limite);
        this.setConta(novaConta);
    }

}

