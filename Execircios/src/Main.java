import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        /*
         * Aumento de Salário: Receba o salário.
         *  Se for até R$ 1500, aumento de 15%. Se for maior, aumento de 10%. Exiba o novo valor.
         * */
    public static void main(String[] args) {
        Scanner inSalario = new Scanner(System.in);

        System.out.println("Informe o seu salario: ");
        double salario = inSalario.nextDouble();

        double salarioMenor = (salario * 0.15) + salario;
        double salarioMaior = (salario * 0.10) + salario;

        if (salario <= 1500) {
            System.out.println("Você teve um aumento de 15%, salário atual R$" + salarioMenor);
        }else {
            System.out.println("Você teve um aumento de 10%, salário atual R$ " + salarioMaior);
        }

    }
}