package Execircio.If.Else;

import java.util.Scanner;

public class Ex06 {
    /*
    *O Consultor de Descontos:
    * Peça o valor de um produto. Pergunte a forma de pagamento (1 para À Vista, 2 para Cartão).
    * Se for 1, tire 10% do valor. Exiba o preço final.
    * */
    public static void main(String[] args) {
        Scanner descontos = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = descontos.nextDouble();

        System.out.println("Digite 1 para pagamento à vista: ");
        System.out.println("Digite 2 para pagamento no cartão: ");
        int formaPagamento = descontos.nextInt();

        double valorDesconto = valor - (valor * 0.010);

        if(formaPagamento == 1){
            System.out.println("O pagamento a vista ficará em " + valorDesconto);
        }else if(formaPagamento == 2){
            System.out.println("O pagamento por cartão ficará em " + valor);
        }else {
            System.out.println("Digite uma opção valida.");
        }

        descontos.close();
    }
}
