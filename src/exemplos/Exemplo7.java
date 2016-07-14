package exemplos;

import javax.swing.JOptionPane;

public class Exemplo7 {
    public static void main(String[] args) {
//        String texto = "isto é um exemplo!";
//        int qdt = texto.length();
//        System.out.println(qdt);
//        System.out.println(
//                "Normal: "+texto +"\nMaiusculo: "+ texto.toUpperCase()+"\nMinuscula: "+ texto.toLowerCase()
//        );
//        String t = "Isto é um texto";
//        t = t.trim();
//        for (int i = 0; i < t.length(); i++){
//            System.out.println(t.charAt(i));
//        }
//        int a = 3000;
//        for (int i = 0; i < String.valueOf(a).length(); i++){
//            System.out.println(String.valueOf(a).charAt(i));
//        }
//        //Pedir
        String nome = JOptionPane.showInputDialog("Digite");
        //Mostrar
        JOptionPane.showMessageDialog(null, nome);
        
       
        
        
    }
}
