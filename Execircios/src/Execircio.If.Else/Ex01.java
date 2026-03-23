package Execircio.If.Else;

import java.util.Scanner;

public class Ex01 {

    /*
    * O Fiscal de App: Peça a idade. Se for > 18, "Acesso liberado". Se não, "Acesso negado".
    * */

    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);

        System.out.println("Qual o seu nome ? ");
        String nome = verificador.nextLine();

        System.out.println("Qual sua idade ? ");
        int idade = verificador.nextInt();

        if (idade >= 18){
            System.out.println(nome + " seu Acesso foi liberado");
        }else {
            System.out.println(nome+ " seu Acesso foi negado");
        }

        verificador.close();
    }
}
