package Execircio.If.Else;

import java.util.Scanner;

public class Ex02 {
    /*
    O Termômetro Humano:
    Leia a temperatura.
    Se > 37.5, "Febre". Se < 30, "Hipotermia".
    Caso contrário, "Saudável".
     */

    public static void main(String[] args) {
        Scanner verficadorTemperatura = new Scanner(System.in);

        System.out.println("Qual a sua temperatura ? ");
        double temperatura = verficadorTemperatura.nextDouble();

        if (temperatura > 31 && temperatura < 37.5){
            System.out.println("Você está Saudável.");
        }else if (temperatura <= 30){
            System.out.println("Você está com Hipotermia.");
        }else{
            System.out.println("Você está com febre.");
        }
        verficadorTemperatura.close();
    }
}
