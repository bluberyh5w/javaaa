import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
double media=0;
double notas=0;

        for (int i = 0; i < 3; i++) {

            System.out.println("diga sua avaliação para o filme");
            double avaliacao = leitura.nextDouble();
            notas = leitura.nextDouble();
            media += notas;
        }
        System.out.println("media de avaliações" + media/3);
    }

}

