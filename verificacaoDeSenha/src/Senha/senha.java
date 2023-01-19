package Senha;


import javax.swing.JOptionPane;

public class senha {

	public static void main(String[] args) {
		
		String senha = JOptionPane.showInputDialog("Digite a senha : ");
		
		int contador = 1;
		
		
		while (!senha.equals("senha123") && contador <= 2) {
			senha = JOptionPane.showInputDialog("Senha Incorreta, tente novamente:\nTentetivas restantes : " + (3 - contador));
			contador++;
		
			
		}
		
		if(senha.equals("senha123")) {
			JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
		}else {
			JOptionPane.showMessageDialog(null, "Acesso bloqueado (SENHA INCORRETA)");
		}
		
	
	}
	
}
		
		
		
		
		
