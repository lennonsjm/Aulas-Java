package ExercicosJava.ExercicioMaratona.Test;

import ExercicosJava.ExercicioMaratona.Aluno;
import ExercicosJava.ExercicioMaratona.Local;
import ExercicosJava.ExercicioMaratona.Professor;
import ExercicosJava.ExercicioMaratona.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local endereco = new Local("Rua 1, Bairro 1, Cidade 1");

        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);

        Professor professor = new Professor("Java Dojo", "Java");

        Aluno[] aluno = {aluno1, aluno2};
        Seminario seminario = new Seminario("Java Avançado", aluno, endereco);

        Seminario[] seminarioDisponiveis = {seminario};
        professor.setSeminarios(seminarioDisponiveis);

       /* System.out.println("Local: " + endereco.getEndereco());
        System.out.println("Aluno 1: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Aluno 2: " + aluno2.getNome() + ", Idade: " + aluno2.getIdade());
        System.out.println("Professor: " + professor.getNome() + ", Especialidade: " + professor.getEspecialidade());
        System.out.println("Seminário: " + seminario.getTitulo());*/

        professor.imprime();

    }
}
