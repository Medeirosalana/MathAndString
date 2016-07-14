package exemplos;

import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String[] args){
        int resultado = 0, opcao = -1;
        do{
            try{
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Opções:\n "
                   + "1- Soma\n "
                   + "2- Subitração\n "
                   + "3- Multiplicação\n"
                   + "4- Divisão\n"
                   + "0- Sair"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        switch(opcao){
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                resultado = a / b;
                break;
            default:
                throw new NullPointerException("Opção invalida");
        } 
        }catch(NumberFormatException | ArithmeticException | NullPointerException erro){
            System.out.println("Erro  " + erro);
        }finally {
                JOptionPane.showMessageDialog(null, resultado);
            }
            }while(opcao != 0);
        
    }   
}
