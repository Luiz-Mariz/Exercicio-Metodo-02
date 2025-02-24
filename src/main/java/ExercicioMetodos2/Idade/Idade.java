package ExercicioMetodos2.Idade;

public class Idade {
    public int idade;


    public int ABC() {
        int categoria;

        if (idade >= 1 && idade <= 10) {
            categoria = 1;
        } else if (idade >= 11 && idade <= 20) {
            categoria = 2;
        } else if (idade >= 21 && idade <= 30) {
            categoria = 3;
        } else {
            categoria = 4;
        }
        return categoria;
    }

    public static void showResult(int value){
        if (value == 1){
            System.out.println("Você pertence a categoria A");
        } else if (value == 2) {
            System.out.println("Você pertence a categoria B");

        } else if (value == 3) {
            System.out.println("Você pertece a categoria C");

        }else {
            System.out.println("Você não pertence a nenhuma categoria");
        }
    }
}


