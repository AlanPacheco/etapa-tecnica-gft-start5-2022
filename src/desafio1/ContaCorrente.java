package desafio1;

public class ContaCorrente extends Conta{

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
}
