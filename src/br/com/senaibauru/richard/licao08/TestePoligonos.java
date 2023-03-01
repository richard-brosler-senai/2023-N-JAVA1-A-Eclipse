package br.com.senaibauru.richard.licao08;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TestePoligonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane dlgMsg = new JOptionPane();
		JDialog dlg = dlgMsg.createDialog("Demonstração "
				+ "de Poligonos");
		dlg.setSize(600, 400);
		Triangulo trg = new Triangulo();
		Retangulo ret = new Retangulo();
		dlg.setContentPane(ret);
		dlg.setVisible(true);
		
	}

}
