package desafio3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alan Pacheco", "Rua 12, 3 etapa, numero 55, Castelo Branco, Salvador/Ba", "7199777-4567");
        Pessoa pessoa2 = new Pessoa("Evelin Maria", "Avenida Tairu, Quadra 12, numero 32, Itaparica/Ba", "7199666-4657");
        Pessoa pessoa3 = new Pessoa("Joaquim Santos", "Bloco Botucatu, Quadra 19, apto 301, Cabula, Salvador/Ba", "7199988-4567");

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        pessoas.forEach(pessoa -> System.out.println(pessoa));
    }
}

