package exemplos;

import java.text.DecimalFormat;

public class Exemplo5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        int idade = 38;
        df.applyPattern("000");
        System.out.println(df.format(idade));
        int qtd = 9750;
        df.applyPattern("#0,000");
        System.out.println(df.format(qtd));
        long est = 198564l;
        df.applyPattern("#,##0,000");
        System.out.println(df.format(est));
        float reais = 3500.25f;
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(reais));
       
    }
}
