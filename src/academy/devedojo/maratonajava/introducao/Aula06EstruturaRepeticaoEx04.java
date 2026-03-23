package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturaRepeticaoEx04 {
    public static void main(String[] args) {
        int contador = 50;
        for (int i = 0; i < contador; i++) {

            if (i > 25) {
                System.out.println("fim");
                break;
            }
            System.out.println(i);

        }
    }
}
