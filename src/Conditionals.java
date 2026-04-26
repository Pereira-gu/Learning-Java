import java.util.Scanner;

public class Conditionals {

    public static void main(String[] arg) {

        //Condicional com valor variavel
        System.out.println("Digite sua idade:");
        Scanner in_idade = new Scanner(System.in);

        int idade = in_idade.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 60 && idade <= 120) {
            System.out.println("idoso");
        } else if (idade < 60) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("|ERROR| digite uma idade real");
        }


//        Abreviação para if's simples
//        variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 13;
        String out =(time <18)? "Bom dia" : "Boa noite";
        System.out.println(out + " Hora: "+time);

//        Switch case (procura a condição, se nao tiver, retorna default)
        switch (1) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quintaa-feira");
                break;
            case 6, 7, 0:
                System.out.println("fim de semana");
                break;
            default:
                System.out.println("dia invalido");
        }
    }
}
