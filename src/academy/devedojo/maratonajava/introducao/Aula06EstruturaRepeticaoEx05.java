package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturaRepeticaoEx05 {
    public static void main(String[] args) {
        // descobri quantidade de vezes que o carro pode ser parcelado
        //condição valorParcela >= 1000;

        double valorCarro = 35000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000){
break;
            }
                System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }


    }
}
