package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 21;
        boolean isPodeCompraBebida = idade >= 18;

        if(idade >= 18){
            System.out.println("Você é está autorizado a compra bebida");
        }

        if (!isPodeCompraBebida){
            System.out.println(
                    "Você não está autorizado a compra bebida"
            );
        }else {
            System.out.println("Parabéns");
        }
    }
}
