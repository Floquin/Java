import javax.swing.JOptionPane;

public class Main{

  public static void main(String args[]){

    int opcao;
    double saldo;
    //double Periodo;

    saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o saldo do seu cartão :","Janela saldo", JOptionPane.INFORMATION_MESSAGE));

    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção:"+
    "\n 1 - Para cancelamento do cartão"+
    "\n 2 - Para consultar seu saldo"+
    "\n 3 - Para habilitar cartão para compras no exterior"+
    "\n 4 - Falar com um atendente","Janela Opções",3));

    switch(opcao){

      case 1: {
        String numero;
        numero = JOptionPane.showInputDialog(null,""+
        "Digite o número do cartão:"
        ,"Janela Cancelamento do cartão",3);


        if (numero.length() == 16 || numero.length() == 19){

          JOptionPane.showMessageDialog(null,"Seu cartão foi cancelado com sucesso OBRIGADO!! ",
          "janela cancelamento", JOptionPane.INFORMATION_MESSAGE); 
          //4024 0071 2768 9007
        
          } else {
          //Não pode cancelar
          JOptionPane.showMessageDialog(null,"Cartão não encontrado, tente novamente","Janela Não encontrado",3);
        }
        break;
      }

      case 2: {
        JOptionPane.showMessageDialog(null,"Seu saldo atual  é : "+saldo,"Janelasaldo",JOptionPane.INFORMATION_MESSAGE);
        break;
      }

      case 3: {
        String País;
        País = JOptionPane.showInputDialog(null,"País destinado a desbloqueio do seu Cartão ","janela País", JOptionPane.INFORMATION_MESSAGE);
        
        double Periodo; 
        Periodo = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o Periodo desejado para desbloqueio do Cartão em Horas",JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null,"Seu Cartão foi desbloqueado para uso no exterior, durante: "+Periodo+ " Horas","Janelaperiodo",JOptionPane.INFORMATION_MESSAGE);
        break;
      }

      case 4: {
        JOptionPane.showMessageDialog(null,"Entre em contato com o Support: https://www.BancodoBrasil.cu.uk/personal/support  ","Janela",JOptionPane.INFORMATION_MESSAGE);
        break; 
      }

      default: {

        JOptionPane.showMessageDialog(null,"Opção não encontrada, tente novamente","Janela Não encontrado",3);

      }

    }

  }
}
