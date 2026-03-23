package academy.devedojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        for (int i = 0; i < dias.length; i++) {
            //Esse for atua na primeira tabela e acha onde está
            //guardada na memória
            for (int j = 0; j < dias[i].length; j++) {
                //esse segundo for executa os item da memória começando pelo 0, e da ir retorna para for de cima
                //localiza o item seguinte da memória e vez para esse for para executa todos os itens guarados...
                //no array até acaba e se não tiver nada retorna 0.
                System.out.println(dias[i][j]);
            }

            System.out.println("----------------------------------------------------------");
            //pode fazer com for-each

            for (int[] arrBase : dias) {//cria uma variável temporária com isso ela consegue roda
                for (int num : arrBase) {
                    System.out.println(num);
                }
            }


        }
    }

}