package Banco;

public class Gerente extends Funcionarios {
    private String login;
    private String senha;

    public Gerente(String login, String senha, String nome,double salario ){
        super(nome, salario);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
