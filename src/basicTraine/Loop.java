package basicTraine;

import java.util.Scanner;

public class Loop {

    //basicTraine.Loop e switch case
    public static void main(String[] arg) {
        System.out.print("digite um numero ");
        Scanner input = new Scanner(System.in);

        //int d = 0;
        //while (++d <= limite) {
        int limite = input.nextInt();
        for (int d = 0; d <= limite; d += 2) {
            switch (d) {
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
//           d += 1;
        }
    }
}

