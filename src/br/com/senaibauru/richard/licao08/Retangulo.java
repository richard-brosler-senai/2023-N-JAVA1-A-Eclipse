package br.com.senaibauru.richard.licao08;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Retangulo extends JPanel{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(100, 100, 300, 200);
	}
}
