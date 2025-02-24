package ExercicioMetodos4.Aplication;

import ExercicioMetodos4.Temperatura.Temperatura;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Temperatura temperatura;

        temperatura = new Temperatura();

        System.out.print("Insira a temperatura em Celsius: ");
        temperatura.temperatura = sc.nextDouble();
        System.out.print("Deseja converter em Fahrenheit ou Kelvin (F/K): ");
        temperatura.escolhaTemperatura = sc.next().charAt(0);

        double convercao = temperatura.converterTemp();
        temperatura.showResult(temperatura.escolhaTemperatura, convercao);
    }
}
