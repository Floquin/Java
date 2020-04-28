import javax.swing.JOptionPane;
class Main{
public static void main (String args []){

  double peso, altura;


    peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual seu peso?","Janelapeso", JOptionPane.QUESTION_MESSAGE));
  altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a sua altura?","Janelaaltura", JOptionPane.QUESTION_MESSAGE));
double IMC = peso/(altura*altura) ;
JOptionPane.showMessageDialog(null, "Seu IMC eh:" +IMC , "Janela", JOptionPane.INFORMATION_MESSAGE);

if (IMC < 17){
JOptionPane.showMessageDialog(null,"Muito abaixo do peso",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if ((IMC >= 17) && (IMC <= 18.49)){
JOptionPane.showMessageDialog(null,"Abaixo do peso",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if ((IMC >= 18.5) && (IMC <= 24.99)){
JOptionPane.showMessageDialog(null,"Peso Normal",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if ((IMC >= 25) && (IMC <= 29.99)){
JOptionPane.showMessageDialog(null,"Acima do peso",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if ((IMC >= 30) && (IMC <= 34.99)){
JOptionPane.showMessageDialog(null,"Obesidade I",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if ((IMC >= 35) && (IMC <= 39.99)){
JOptionPane.showMessageDialog(null,"Obesidade II",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}
if (IMC >= 40){
JOptionPane.showMessageDialog(null,"Obesidade III ",
"Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
}

}
}
