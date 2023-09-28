
public class condicional {
    public static void main(String[]args) {

        int AnoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

            if (AnoDeLancamento >=2022){
                System.out.println("ano de lançamento que os clientes tãoas curtindo");
            } else {
                System.out.println("filme retro dos anos 80");
            }
            if (incluidoNoPlano == true || tipoPlano.equals("plus")){
                System.out.println("filme liberado");


            }else {
                System.out.println("deve pagar a locação");
            }



    }
}