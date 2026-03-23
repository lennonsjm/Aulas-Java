package academy.devedojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        //byte, short, long, float e double -> retorna 0
        //char-> retorna vazio '' ou '\u0000'
        //boolean -> retorna false
        //String -> retorna null - porque é um objeto


       /* String[] idades = new String[10];
        System.out.println("Idades: " + idades[0]);
        System.out.println("Idades: " + idades[1]);
        System.out.println("Idades: " + idades[2]);*/

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";
        nomes[3] = "Antonio";

        for (int i = 0; i < 4; i++) { //pode usar o length para passar todo o array sem saber o tamanho dele.
            System.out.println("Nome: " + nomes[i]);
        }

    }
}
