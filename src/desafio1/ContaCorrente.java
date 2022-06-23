package desafio1;

import desafio2.Imposto;

public class ContaCorrente extends Conta implements Imposto {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return saldo * 0.03;
    }

    @Override
    public Double calcularImposto() {
        return rendimento() * 0.25;
    }
}
