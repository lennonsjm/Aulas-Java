package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 16;
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.andar();
        estudante2.trabalha();
    }


}
