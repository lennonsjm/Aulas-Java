package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int nota = 5;
// essa é forma de estrutura condicionais ternário.
        //formula -> condição ? valor_se_verdadeiro : valor_se_falso;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
