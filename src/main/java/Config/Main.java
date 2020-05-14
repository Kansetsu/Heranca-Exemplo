package Config;

import Banco.*;


public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("adm", "123", "Joãozinho", 1045);
        Telefonista t = new Telefonista("Pedrinho", 1045, "666222");
        Secretaria s = new Secretaria("Luizinha",1045,"3266-1111");

        System.out.printf("Gerente: %s\nLogin: %s\nSenha: %s\nSalário: %s\n\n",
                g.getNome(),g.getLogin(),g.getSenha(), g.getSalario());

        System.out.printf("Telefonista: %s\nSalário: %s\nCódigo: %s\n\n",
                t.getNome(), t.getSalario(),t.getCodigoTrabalho());

        System.out.printf("Secretária: %s\nSalário: %s\nNúmero do Ramal: %s",
                s.getNome(), s.getSalario(),s.getNumeroRamal());
    }
}
