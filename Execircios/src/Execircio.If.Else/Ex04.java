package Execircio.If.Else;

import java.util.Scanner;

public class Ex04 {

    /*
    *Par ou Ímpar Real: Receba um número inteiro e diga se ele é par ou ímpar.
    * */
    public static void main(String[] args) {
        Scanner real = new Scanner(System.in);

        System.out.println("Descubra se o número é Par ou Impar");
        System.out.println("Digite um número: ");
        int  numero = real.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é impar");
        }else {
            System.out.println("O número " + numero + " é par");
        }
    }

}
