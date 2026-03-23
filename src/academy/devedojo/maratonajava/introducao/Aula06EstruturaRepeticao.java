package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao {
    //estrutura de repetição -> while / do while / for.

    public static void main(String[] args) {
        //while -> estrutura

        int count = 0;
        while (count < 10) {
            System.out.println(count);
           count++;    // pode ser assim
                        //count = count + 1 ou System.out.println(++count);
        }
        //estrutura do while
        do {
            System.out.println("dentro do while");
        }while (count < 10);

        //estrutura for         -> int i = i de implementador.
        for (int i = 0; i < 10; i++) {
            System.out.println("testando for" +i);
        }
    }
}
