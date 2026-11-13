package ExercicosJava.TiposPrimitivosOperadores.V02;

public class Ex01 {
    /*Escreva um programa que calcule
    o valor de uma parcela de um empréstimo
    acrescida de juros simples de 2,5% ao mês sobre um capital inicial.*/
    public static void main(String[] args) {
        double valorEmprestimo = 1000;
        double taxaJuros = 0.25;

        double valorJuros = valorEmprestimo * taxaJuros;

        System.out.println("Valor do empréstimo: " + valorEmprestimo);
        System.out.println("Valor dos juros: " + valorJuros);
        System.out.println("Valor total: " + (valorEmprestimo + valorJuros));
    }
}
