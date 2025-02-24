package ExercicioMetodos3.Saque;

public class Caixa {
    public double saldo;
    public double saque;


    public boolean verificacao(){
        boolean verificacaoSaque;
        if (saque <= saldo){
            verificacaoSaque = true;
        }
        else {
            verificacaoSaque = false;
        }
        return  verificacaoSaque;
    }


    public static void showResult(Boolean value){
        if (value == true){
            System.out.println("Você pode sacar o dinheiro");
        }
        else {
            System.out.println("Você não pode sacar o dinheiro");
        }
    }
}
