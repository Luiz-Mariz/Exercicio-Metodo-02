package ExercicioMetodos1.application;

import ExercicioMetodos1.veriSenha.Senha;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       Senha senha;

       senha = new Senha();

        System.out.print("Crie uma senha: ");
        senha.a = sc.next();

        Boolean verificacao = senha.Verificacao();
        Senha.showResult(verificacao);

    }
}
