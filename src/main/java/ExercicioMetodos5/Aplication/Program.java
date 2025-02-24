package ExercicioMetodos5.Aplication;

import ExercicioMetodos5.Doar.Doar;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doar doar;

        doar = new Doar();

        System.out.print("Informe sua idade: ");
        doar.idade = sc.nextInt();
        System.out.print("Informe seu peso: ");
        doar.peso = sc.nextDouble();

        String aptoDoar = doar.apto();
        doar.showResult(aptoDoar);
    }
}
