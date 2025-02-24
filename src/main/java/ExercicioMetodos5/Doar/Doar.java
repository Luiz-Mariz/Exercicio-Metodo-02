package ExercicioMetodos5.Doar;

public class Doar {
    public int idade;
    public double peso;

    public String apto(){
        String resp;
        if ((idade >= 18 && idade <=65) && (peso >=50)){
            resp = "Você esta apto a doar sangue";
        }else {
            resp = "Você não esta apto a doar sangue";
        }
        return resp;
    }

    public static void showResult (String apto){
        System.out.println(apto);
    }
}
