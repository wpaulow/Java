package aula;

import javax.swing.JOptionPane;

public class Principal {

	public void getCombustivel() {
		int combustivel = 0;
		String x = JOptionPane.showInputDialog("informar o combust�vel:");
		if (x.isEmpty()) {
			return;
		}
		try {
			combustivel = Integer.parseInt(x);
		} catch (Exception e) {
			System.out.println("o valor � inv�lido.");
			this.getCombustivel();
		}
	}
	
	public void getKm() {
		int km = 0;
		String y = JOptionPane.showInputDialog("informar o km:");
		if (y.isEmpty()) {
			return;
		}
		try {
			km = Integer.parseInt(y);
		} catch (Exception e) {
			System.out.println("o valor � inv�lido.");
			this.getKm();
		}
	}
}


//ctrl + shift + f = identa��o;