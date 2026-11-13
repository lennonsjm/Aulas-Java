package ExercicosJava.TiposPrimitivosOperadores.V02;

public class Ex02 {
    /*Crie um programa que converta uma temperatura de Celsius para Fahrenheit
    utilizando a fórmula F = (C × 9/5) + 32, usando tipos numéricos adequados para evitar perda de precisão*/

    public static void main(String[] args) {
        double celsius = 10;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

    }

}
