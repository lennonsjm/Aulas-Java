package Execircio.If.Else;

import java.util.Scanner;

public class Ex03 {
    /*
    A Balança do Mal (IMC):
    Peça peso e altura. Calcule IMC = peso / (altura \times altura).
$IMC < 18.5: "Abaixo do peso".

$18.5 <= IMC < 25: "Peso ideal".

$IMC >= 25: "Sobrepeso". */
    public static void main(String[] args) {
        Scanner imc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = imc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = imc.nextDouble();

        double pesoImc = peso / (altura * altura);
        if (pesoImc < 18.5){
            System.out.println("Seu imc é "+ pesoImc + " = Abaixo do peso");
        } else if (pesoImc >= 18.5 && pesoImc < 25) {
            System.out.println("Seu imc é "+ pesoImc + " = Peso ideal");
        }else {
            System.out.println("Seu imc é "+ pesoImc + " = SobrePeso");
        }
        imc.close();
        }
    }

