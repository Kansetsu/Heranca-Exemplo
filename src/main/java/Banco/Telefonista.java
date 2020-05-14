package Banco;

public class Telefonista extends Funcionarios{
    private String codigoTrabalho;

    public Telefonista(String nome, double salario, String codigoTrabalho) {
        super(nome, salario);
        this.codigoTrabalho = codigoTrabalho;
    }

    public String getCodigoTrabalho() {
        return codigoTrabalho;
    }

    public void setCodigoTrabalho(String codigoTrabalho) {
        this.codigoTrabalho = codigoTrabalho;
    }
}
