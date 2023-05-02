
package prova1;

public abstract class Conta implements ContaDeBanco {

    private double saldo;
    protected double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public String sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            return "OK";
        } else {
            return "Valor indisponível";
        }
    }

    public String transferir(double valor, Conta contaDestino) {
        String resultado = sacar(valor);
        if (resultado.equals("OK")) {
            contaDestino.deposita(valor);
            return "OK";
        } else {
            return "Transferência não realizada";
        }
    }

    public void atualiza(double taxa) {
        saldo += saldo * taxa;
    }
}

