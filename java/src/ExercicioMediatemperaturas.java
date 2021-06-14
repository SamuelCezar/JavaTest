import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/



public class ExercicioMediatemperaturas {

    public static String retornaMes(int index) {
        String mes ="";
        switch (index + 1) {
            case 1:
                mes = "Janeiro";
                return mes;
            case 2:
                mes = "Fevereiro";
                return mes;
            case 3:
                mes = "Março";
                return mes;
            case 4:
                mes = "Abril";
                return mes;
            case 5:
                mes = "Maio";
                return mes;
            case 6:
                mes = "Junho";
                return mes;
        }
        return mes;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturaSemestre = new ArrayList<Double>();

        Double soma = 0.0;

        for(int i = 1; i <= 6; i++ ) {
            System.out.println("Digite a temperatura do mês " + i + ":");
            Double temperatura = scan.nextDouble();
            temperaturaSemestre.add(temperatura);
            soma += temperatura;

        }

        Double media = soma / temperaturaSemestre.size();
        System.out.println("Temperaturas semestrais:" + temperaturaSemestre);
        System.out.println("A média das temperturas do sementre foi de: " + String.format("%.2f", media) + "º.");
        System.out.println("----------------------------------------------------------------------");

        for (Double temperatura : temperaturaSemestre) {
            if(temperatura > media){
                System.out.println("A temperatura do mês de " + retornaMes(temperaturaSemestre.indexOf(temperatura))
                      +" foi de: " +temperatura+ "º, ficando acima da média do semestre que é de: "
                      + String.format("%.2f", media) +"º.");
            }
        }

    }

}

