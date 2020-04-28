import javax.swing.JOptionPane;

public class Main{


  public static void main(String args[]){
  
    double salario;
  
   salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu salario mensal: ","Janela salario", JOptionPane.INFORMATION_MESSAGE));

    double desconto8= (salario*8/100);
    double valorfinal = (salario-desconto8);
    double desconto9 = (salario*9/100);
    double valorfinal2 = (salario-desconto9);
    double desconto11 = (salario*11/100);
    double valorfinal3 = (salario-desconto11);


    if (salario <= 1830.29){
     JOptionPane.showMessageDialog(null,"Aliquota INSS de 8%" +desconto8+
     "\n"+"Seu valor liquido: " +valorfinal+  JOptionPane.INFORMATION_MESSAGE);
    }

   if (salario >= 1830.30 && salario <= 3050.52){
     JOptionPane.showMessageDialog(null,"Aliquota INSS de 9%" +desconto9+
     "/n"+"Seu valor liquido: " +valorfinal2+ JOptionPane.INFORMATION_MESSAGE);
    }

    if (salario >= 3050.53 && salario <= 6101.06){
      JOptionPane.showMessageDialog(null,"Aliquota INSS de 11%" +desconto11+
      "/n"+"Seu salario: " +valorfinal3+ JOptionPane.INFORMATION_MESSAGE);
    }

    if (salario > 6101.07){
      JOptionPane.showMessageDialog(null,"Voce esta ganhando demais, CUIDADO ESTAMOS DE OLHO !! "+JOptionPane.INFORMATION_MESSAGE);
    }


  } 
}
