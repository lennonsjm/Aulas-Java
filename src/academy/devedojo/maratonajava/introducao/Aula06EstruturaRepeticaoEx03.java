package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturaRepeticaoEx03 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 1000000){
            i++;
            if(i%2==0){

                System.out.println(i);
            }

        }
    }
}
