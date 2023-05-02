
package prova1;

public class TesteAgencia {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "12345678900");
        Cliente cliente2 = new Cliente("Maria", "98765432100");
        ContaCorrente contaCorrente1 = new ContaCorrente(1000, 500, cliente1);
        ContaCorrente contaCorrente2 = new ContaCorrente(2000, 1000, cliente2);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(5000, cliente1);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(10000, cliente2);
        Agencia agencia = new Agencia("001");

        agencia.cadastrarCliente(cliente1);
        agencia.cadastrarCliente(cliente2);

        agencia.adicionarConta(contaCorrente1);
        agencia.adicionarConta(contaCorrente2);
        agencia.adicionarConta(contaPoupanca1);
        agencia.adicionarConta(contaPoupanca2);

        System.out.println("Valor total da agência: " + agencia.valorTotalAgencia());
    }
}