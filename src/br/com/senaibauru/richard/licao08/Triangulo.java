package br.com.senaibauru.richard.licao08;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Triangulo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		int[] xPontos = {100,200,300};
		int[] yPontos = {150, 50, 150};
		g.setColor(Color.red);
		g.fillPolygon(xPontos, yPontos, 3);
	}
}
