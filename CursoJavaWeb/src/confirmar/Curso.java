package confirmar;

import javax.swing.JOptionPane;

public class Curso {
	public static void main(String[] args) {
	       
		 //INSERINDO DADOS COM JOptionPane.showInputDialog
			
		  String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		  String pessoas = JOptionPane.showInputDialog("Informe a quntidade de pessoas?");
		  
		  Double carroNumero = Double.parseDouble(carros);
		  Double pessoaNumero = Double.parseDouble(pessoas);
		  
		  int divisao = (int) (carroNumero / pessoaNumero);
		  
		  Double resto = carroNumero % pessoaNumero;
		  
		/*  System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou "+resto+ " carros "); */
		  
		  //showConfirmDialog CONFIRMA SE DESEJA VER O RESULTADO
		 int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		 
		 //0=sim,1=nao,2=canselar
		  
		 if (resposta == 0) {
			 JOptionPane.showMessageDialog(null, "Divisão para duas pessoas deu "+ divisao);
			}else {
				//System.out.println("Não quiz ver o resultado");
				JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
			}
		  
		     resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		  
		  if (resposta == 0) {
			  JOptionPane.showMessageDialog(null, "Oresto da divisão é "+ resto);
		  }else {
			  //System.out.println("Não quiz ver o resultado");
			  JOptionPane.showMessageDialog(null, "Não quiz ver o resultado");
		}
		  
		  System.out.println(resposta);
		  
		  
		//showMessageDialog MOSTRA MENSSAGEM NA TELA AO INVES DO CONSOLE
		 // JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou "+resto+ " carros ");
		}

}
