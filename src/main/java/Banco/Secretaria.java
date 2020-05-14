package Banco;

public class Secretaria extends Funcionarios{
    private String numeroRamal;

    public Secretaria(String nome, double salario, String numeroRamal){
        super(nome, salario);
        this.numeroRamal = numeroRamal;
    }

    public String getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(String numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}
