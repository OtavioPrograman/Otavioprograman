
package prova1;

import java.util.Random;

public class Funcionarios {

public class Funcionario extends Pessoa {

    private double salario;
    private String chapa;

    public Funcionario(String nome, int telefone, String email, String cpf, double salario, String chapa) {
        super(nome, telefone, email, cpf);
        this.salario = salario;
        this.chapa = chapa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: o salário não pode ser negativo ou igual a zero.");
        }
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public void criarNumeroRandomico() {
        Random random = new Random();
        int numero = random.nextInt(1000);
        System.out.println("Número randomico: " + numero);
    }

    public void setBonificacao() {
        salario += salario * 0.1;
        System.out.println("Salário com bonificação: " + salario);
    }

}
    
}