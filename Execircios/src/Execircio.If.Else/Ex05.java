package Execircio.If.Else;

import java.util.Scanner;

public class Ex05 {

    /*
    Aprovado ou DP?
    Peça 3 notas, tire a média aritmética. Se média >= 7, "Aprovado".
    Se entre 5 e 6.9, "Prova de Recuperação". Abaixo de 5, "Reprovado".
    * */
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Digite primeira nota: ");
        float nota1 = notas.nextFloat();

        System.out.println("Digite segunda nota: ");
        float nota2 = notas.nextFloat();

        System.out.println("Digite terceira nota: ");
        float nota3 = notas.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.printf("Sua média é "+ media + " Aprovado\n");
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Sua média é " + media + " e você está em Recuperação\n");
        }else {
            System.out.printf("Sua média é " + media + " Reprovado\n");
        }

        notas.close();
    }
}
