package Execircio.If.Else;

import java.util.Scanner;

public class Ex10 {
    /*
     * Dia da Semana: Receba um número de 1 a 7 e imprima o nome do dia (1-Domingo, etc.). Use
     * */
    public static void main(String[] args) {
        Scanner recebendoNum = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");
        int numero1 = recebendoNum.nextInt();

        switch (numero1) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

                default:
                    System.out.println("Numero invalido");

        }
    }
}

