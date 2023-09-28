import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        String nome = "yudao";
        String tipo = "corrente";
        double saldo = 1550.99;
        int opçao = 0;
        double trans = 0;
        
        Scanner leitura = new Scanner(System.in);


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipo);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                **digite sua opção
                
                  1 - Consultar saldo
                  2 - Transferir valor
                  3 - Receber valor\s
                  4 - Sair
                
                """;

        while (opçao != 4) {
            System.out.println(menu);
            opçao = leitura.nextInt();
            

           switch (opçao) {

               case 1:
                   System.out.println("seu saldo atual é de R$" + saldo + " reais.");
                   break;

               case 2:
                   System.out.println("quanto gostaria de transferir?");
                   trans = leitura.nextDouble();
                   double v = saldo - trans;
                   saldo = v;
                   if (saldo < trans)
                       System.out.println("\nValor insuficiente para transferencia, tente um valor mais baixo.\n");
                   else if (saldo >= trans)System.out.println("\n seu saldo atual no momente é de R$" + v + (" reais."));
                   break;

               case 3:

                   System.out.println("quanto gostaria de receber?");
                   trans = leitura.nextDouble();
                   double r = saldo + trans;
                   saldo = r;
                   System.out.println("\n seu saldo atual no momente é de R$" + r + (" reais."));
                   break;

               case 4:
                   System.out.println("finalizando o sistema");
                   break;

               default:
                   System.out.println("opção invalida tente novamente\n");
                break;

           }
        }
    }
}