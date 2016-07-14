package exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        double n1 = 2.3658917f, n2 = 5.65456312f;
        n1 =(float) Math.floor(n1);
        n2 =(float) Math.ceil(n2);
        System.out.println("Baixo: " +n1 +"\nCima: "+ n2 );
    }
}
