package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {

        //switch case é uma maneira simples de condicionais para condições simples como
        //ex(dia da semana, sexo da pessoa e etc) desde seja processo curto.
        //ele suporta: char, int, byte, short, enum e String.

        char sexo = 'c';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Coloque uma opção válida!");
                break;
        }
    }
}
