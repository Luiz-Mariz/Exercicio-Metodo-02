package ExercicioMetodos3.Aplication;

import ExercicioMetodos3.Saque.Caixa;
import java.util.Scanner;
import static ExercicioMetodos3.Saque.Caixa.showResult;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Caixa caixa;

        caixa = new Caixa();

        System.out.print("Insira seu saldo: ");
        caixa.saldo = sc.nextDouble();
        System.out.print("Insira a quantidade do saque: ");
        caixa.saque = sc.nextDouble();

        Boolean verificacao = caixa.verificacao() ;
        showResult(verificacao);
    }
}
