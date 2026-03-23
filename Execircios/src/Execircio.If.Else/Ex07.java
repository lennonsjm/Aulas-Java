package Execircio.If.Else;

import java.util.Scanner;

public class Ex07 {

    /*
    * O Triângulo Impossível: Receba 3 lados (A, B, C).
    * Verifique se formam um triângulo:
    * (A + B > C) E (A + C > B) E (B + C > A).
    * */

    public static void main(String[] args) {
        Scanner verifacaTriangulo = new Scanner(System.in);

        System.out.println("Digite o valor do ladoA do triangulo: ");
        double ladoA = verifacaTriangulo.nextDouble();

        System.out.println("Digite o valor do ladoB do triangulo: ");
        double ladoB = verifacaTriangulo.nextDouble();

        System.out.println("Digite o valor do ladoC do triangulo: ");
        double ladoC = verifacaTriangulo.nextDouble();

        boolean calculo =(ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
        if (calculo == true) {
            System.out.println("Deu tudo certo");
        }else {
            System.out.println("Deu tudo errado");
        }
verifacaTriangulo.close();
    }
}
