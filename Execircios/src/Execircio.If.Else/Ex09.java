package Execircio.If.Else;

import java.util.Scanner;

public class Ex09 {
    /*
    *Votante Obrigatório: Receba a idade.

< 16: Não vota.

16-17 ou > 70: Voto opcional.

18-70: Voto obrigatório.
    */

    public static void main(String[] args) {
        Scanner permissao = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = permissao.nextInt();

        if (idade < 16){
            System.out.println("Não pode vota por quer menos que 16 anos");
        } else if ((idade >= 70 )|| idade <= 17 ) {
            System.out.println("O voto é opcional");
        }else {
            System.out.println("Voto obrigatorio");
        }

    }
}
