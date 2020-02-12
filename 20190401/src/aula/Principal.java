package aula;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame {
	
	private JPanel painel;
	
	public Principal (String titulo) {
		super(titulo);
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.painel = new JPanel ();
		this.add(this.painel);
		this.painel.setBackground(Color.BLUE);
	}
	
	
	public static void main (String args[]) {
		new Principal ("título legal");
		
	}
}