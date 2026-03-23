package javacore.introducaoclasses.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
    public double media;

    public Funcionario() {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    public double imprimiMedia() {
        double soma = 0;
        for (double salarios : salario) {
            soma += salarios;
        }
        return soma / salario.length;// divide pelo tamanho total do array


    }

    public void imprimi() {
        System.out.println("---Ficha do Funcionario---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salario: ");
        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i] + " ");
        }

        System.out.println("\nMedia: " + media);
    }

}
