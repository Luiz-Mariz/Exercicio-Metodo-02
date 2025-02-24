package ExercicioMetodos4.Temperatura;

public class Temperatura {
    public double temperatura;
    public char escolhaTemperatura;
    public Object showResult;

    public double converterTemp(){
        double convertido = 0;
        if (escolhaTemperatura == 'F'){
            convertido = temperatura * 1.8 + 32;
        } else if (escolhaTemperatura == 'K') {
            convertido = temperatura + 273;
        }
        return  convertido;
    }

    public static void showResult(char escolhaTemperatura, double temperatura) {
        if (escolhaTemperatura == 'F') {
            System.out.println("Temperatura convertidas em Fahrenheit: " + temperatura);
        } else if (escolhaTemperatura == 'K') {
            System.out.println("Temperatura convertida em Kelvin: " + temperatura);
        } else {
            System.out.println("Error");
        }
    }
}
