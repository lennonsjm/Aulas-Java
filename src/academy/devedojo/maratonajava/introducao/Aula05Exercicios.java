package academy.devedojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula05Exercicios {
    public static void main(String[] args) {
        double valorDinheiro = 80000;

        if (valorDinheiro <= 34712) {
           double taxa1 = valorDinheiro * (9.70/100);
            System.out.println("Seu dinheiro é de R$" +valorDinheiro+ " - R$" + taxa1 + " de taxa e sobrou R$" + (valorDinheiro - taxa1));
        } else if (valorDinheiro >= 34713 && valorDinheiro <= 68507) {
            double taxa2 = valorDinheiro * (37.35/100);
            System.out.println("Seu dinheiro é de R$" +valorDinheiro+ " - R$" + taxa2 + " de taxa e sobrou R$" + (valorDinheiro - taxa2));
        }else {
            double taxa3 = valorDinheiro * (49.50/100);
            System.out.println("Seu dinheiro é de R$" +valorDinheiro+ " - R$" + taxa3 + " de taxa e sobrou R$" + (valorDinheiro - taxa3));
        }
    }
}
