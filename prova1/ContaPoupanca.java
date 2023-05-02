
package prova1;

public abstract class ContaPoupanca extends Conta {
    
    public ContaPoupanca(double saldo, double limite) {
        super(saldo, limite);
    }
    
    @Override
    public void atualiza(double taxa) {
        double valorAtualizado = this.getSaldo() + (this.getSaldo() * (taxa * 3));
        this.setSaldo(valorAtualizado);
    }
}

