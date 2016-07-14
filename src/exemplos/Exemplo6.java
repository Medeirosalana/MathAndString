package exemplos;

import java.text.DecimalFormat;
import java.util.Locale;


public class Exemplo6 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        float valor = 1370.25f;
        if(local.getCountry().equals("BR")){
            df.applyPattern("R$ #,##0.00");
        }
        System.out.println("Sigla: " + local.getCountry()+ "\nPais: " + local.getDisplayCountry()
                +"\nIdioma: " + local.getDisplayLanguage()+ "\nTeclado: " + local.getDisplayName()
                +"\nValor: " + df.format(valor));
    }
}
