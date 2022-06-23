package desafio1;

import desafio2.Imposto;

public class ContaPoupanca extends Conta implements Imposto {

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return saldo * 0.05;
    }

    @Override
    public Double calcularImposto() {
        return rendimento() * 0.10;
    }
}
