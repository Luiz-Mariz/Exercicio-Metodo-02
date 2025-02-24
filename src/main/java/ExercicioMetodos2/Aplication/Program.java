package ExercicioMetodos2.Aplication;

import ExercicioMetodos2.Idade.Idade;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Idade idade;

        idade = new Idade();

        System.out.print("Insira sua idade: ");
        idade.idade = sc.nextInt();

        int ABC = idade.ABC();
        Idade.showResult(ABC);

    }


}
