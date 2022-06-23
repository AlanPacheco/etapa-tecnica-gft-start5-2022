package desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        int countTypeGasolina = 0;
        int countTypeDiesel = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.println("Tipo de Combustivel: Gasolina ou Diesel? (g/d): ");
            char tipoCombustivel = scanner.next().charAt(0);
            scanner.nextLine();

            switch (tipoCombustivel) {
                case 'g': {
                    Carro carroAGasolina = new CarroMovidoAGasolina(modelo, marca, "gasolina");
                    carros.add(carroAGasolina);
                    countTypeGasolina++;
                    break;
                }
                case 'd': {
                    Carro carroADiesel = new CarroMovidoADiesel(modelo, marca, "diesel");
                    carros.add(carroADiesel);
                    countTypeDiesel++;
                    break;
                }

            }


        }

        //Executando o metodo toString da classe
        System.out.println("\nLISTAGEM DE CARROS:");
        carros.forEach(carro -> System.out.println(carro));
        scanner.close();

        System.out.println("\nTOTAL DE CARROS INFORMADOS POR TIPO DE COMBUSTIVEL");
        System.out.println("Total de carros a Gasolina: " + countTypeGasolina);
        System.out.println("Total de carros a Diesel: " + countTypeDiesel);
    }
}
