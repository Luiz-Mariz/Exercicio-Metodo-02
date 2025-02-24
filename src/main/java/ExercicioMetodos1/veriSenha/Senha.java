package ExercicioMetodos1.veriSenha;

import java.util.Scanner;

public class Senha {
    public String a;
    public String b;



    public Boolean Verificacao() {
        Scanner sc = new Scanner(System.in);
        boolean resp;
        int cont = 1;

        if (a.equals(b)) {
            resp = true;
        } else {
            resp = false;
        }
        while ((resp != true) && (cont < 4)) {
            System.out.printf("Digite novamente(%d): ", cont);
            b = sc.next();
            if (a.equals(b)) {
                resp = true;
            } else {
                resp = false;
            }
            cont++;
        }
        return resp;
    }

        public static void showResult (Boolean resp){
            if (resp == true) {
                System.out.println("Senha correta");
            } else {
                System.out.println("Tente novamente mais tarde");
            }
        }


}
