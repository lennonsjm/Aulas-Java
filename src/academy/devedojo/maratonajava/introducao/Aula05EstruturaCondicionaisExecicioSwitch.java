package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturaCondicionaisExecicioSwitch {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                    case 6:
                        System.out.println("Sexta-Feira");
                        break;
                        case 7:
                            System.out.println("Sábado");
                            break;
            default:
                System.out.println("Coloque um dia válido !!!");

        }
    }
}
//Abaixo correção do prof°
/*
 *Correção do execício prof°
 *
 * byte dia = 6;
 *
 * switch (dia) {
 * case 1:
 * case 7:
 * System.out.println("FDS");
 * break;
 * case 2:
 * case 3:
 * case 4:
 * case 5:
 * case 6:
 * System.out.println("Dia Útil");
 * break;
 * default:
 * System.out.println("Opção Inválida");
 * break;
 * }
 *
 * Essa correção foi de um jeito diferente do que pensei em solucionar o problema.
 *
 * */