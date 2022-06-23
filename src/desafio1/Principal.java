package desafio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Conta contaCorrente1 = new ContaCorrente(1001, "Alan Pacheco", 2500.00);
        Conta contaCorrente2 = new ContaCorrente(1002, "Juliana Santos", 3500.00);
        Conta contaPoupanca1 = new ContaPoupanca(1003, "Ben Adrian", 5000.00);
        Conta contaPoupanca2 = new ContaPoupanca(1004, "Maitê Pacheco", 7500.00);

        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);

        System.out.println("RENDIMENTOS DE CADA CONTA");
        contas.forEach(conta ->
                System.out.println("Número: " + conta.getNumero() +
                        " - Titular: " + conta.getTitular() +
                        " - Saldo: " + String.format("%.2f", conta.getSaldo()) +
                        " - Rendimento: " + String.format("%.2f", conta.rendimento()))
        );
    }
}


