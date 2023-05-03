public interface ContaDeBanco {

    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(ContaDeBanco contaDestino, double valor);
    
}
