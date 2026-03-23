package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Carro;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.cor = "Vermelho";
        carro.ano = 1996;

        System.out.println(carro.marca);
    }
}
