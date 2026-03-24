package Execircio.If.Else;

import java.util.Scanner;

public class Ex08 {

    /*
     * Múltiplo de 5: Verifique se um número fornecido é múltiplo de 5.
     */

    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = verificador.nextDouble();

        int num = 5;

        if (numero % num == 0){
            System.out.println("O número é multipo de 5");
        }else {
            System.out.println("O número não é multipo de 5");
        }
    }
}
