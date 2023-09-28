import java.util.Scanner;

public class whil {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media=0;
        double notas=0;
        int total=0;

        while (notas != -1){
            System.out.println("diga sua avalaição ou aperte -1 para encerrar");
            notas = leitura.nextDouble();

            if(notas != -1)
            media += notas;
            total++;
        }
        System.out.println("media de avaliações" + media/total);
    }

}



