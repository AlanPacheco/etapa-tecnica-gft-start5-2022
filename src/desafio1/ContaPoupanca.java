package desafio1;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return saldo * 0.05;
    }
}
