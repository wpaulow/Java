package exercicio;

import javax.swing.JFrame;

public class Principal extends JFrame {
	
	public Principal() {
		super("consegui");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String args[]) {
		new Principal();
	}
}
