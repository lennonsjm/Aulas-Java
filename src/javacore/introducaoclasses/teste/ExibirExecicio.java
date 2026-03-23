package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Funcionario;

public class ExibirExecicio {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome = "jose";
        f1.idade = 30;
        f1.salario = new double[]{100, 200, 300};
        f1.media = f1.imprimiMedia();


        f1.imprimi();
    }


}