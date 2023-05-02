
package prova1;

public class Gerente extends Funcionarios {

    private String senha;

    public Gerente(String nome, int telefone, String email, String cpf, double salario, String chapa) {
    }

    public String cadastrarSenha(String senha) {
        if (senha.length() >= 5) {
            this.senha = senha;
            return "Senha cadastrada com sucesso";
        } else {
            return "Senha deve conter no mínimo 5 caracteres";
        }
    }

    public boolean autentica(String senha) {
        return senha.equals(this.senha);
    }

    public void setBonificacao() {
        double salario = 0;
        salario += salario * 0.2;
    }
}
