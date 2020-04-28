import javax.swing.JOptionPane;
class Main{
public static void main (String args []){

double AnoNascimento;
double AnoAtual;

AnoNascimento = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual ano voce nasceu?","janela",JOptionPane.INFORMATION_MESSAGE));

AnoAtual = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual estamos?","janela",JOptionPane.INFORMATION_MESSAGE));

float Resultado = (float) (AnoAtual-AnoNascimento);
float Meses = (float) (Resultado*12);
float Semanas = (float) (Resultado*52);
float Dias = (float) (Resultado*365);

JOptionPane.showMessageDialog(null, "Sua idade em anos: " +Resultado+
                    "\n"+"Sua idade em Meses: " +Meses+ 
                    "\n"+"Sua idade em Semanas: " +Semanas+
                    "\n"+"Sua idade em Dias: " +Dias+ JOptionPane.INFORMATION_MESSAGE);

  }
}
