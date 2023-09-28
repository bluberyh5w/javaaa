import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("qual ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("diga sua avaliação do filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);


    }
}
