package curso;

import javax.swing.JOptionPane;

public class CursoWeb {
	
	public static void main(String[] args) {
       
	 //INSERINDO DADOS COM JOptionPane.showInputDialog
		
	  String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	  String pessoas = JOptionPane.showInputDialog("Informe a quntidade de pessoas?");
	  
	  Double carroNumero = Double.parseDouble(carros);
	  Double pessoaNumero = Double.parseDouble(pessoas);
	  
	  int divisao = (int) (carroNumero / pessoaNumero);
	  
	  Double resto = carroNumero % pessoaNumero;
	  
	/*  System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou "+resto+ " carros "); */
	  
	  
      //showMessageDialog MOSTRA MENSSAGEM NA TELA AO INVES DO CONSOLE
	  
	  JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou "+resto+ " carros ");
	}

}
