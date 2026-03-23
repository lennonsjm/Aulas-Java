package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Estudante;

public class Estudante02 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,10};//jeito de fazer arrays
        estudante01.somarArrays(numeros);
        estudante02.somaVarArgs(1,2,3,4,5,6,7,8,9,10);//jeito de fazer o VAR ARGS é mesma coisa com menos código
    }
}
