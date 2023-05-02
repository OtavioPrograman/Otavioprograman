
package prova1;

    public abstract class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    public void deposita(double valor) {
        double valorDescontado = valor - 0.1;
        super.deposita(valorDescontado);
    }

    public void atualiza(double taxa) {
        super.atualiza(taxa * 2);
    }
}
