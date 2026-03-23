package javacore.introducaoclasses.dominio;

public class Estudante {

        public String nome;
        public int idade;
        public char sexo;

        public void andar(){
            System.out.println("Estou andando!");
        }

        public void trabalha(){
            System.out.println("Estou trabalhando!");

        }


        public void somarArrays(int[] numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }

        public void somaVarArgs(int... numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }
}
