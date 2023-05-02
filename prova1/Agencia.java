
package prova1;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Cliente> cliente;

    public Agencia() {
        this.cliente = new ArrayList<Cliente>();
    }

    public void cadastrarCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public double valorTotalAgencia() {
        double valorTotal = 0;

        for (Cliente cliente : cliente) {
            for (Conta conta : cliente.getConta()) {
                valorTotal += conta.getSaldo();
            }
        }

        return valorTotal;
    }
}

