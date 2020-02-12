package aula20190603;

import javax.swing.JOptionPane;

public class Velha {
	private boolean jogador = true;
	private String Tabuleiro[][] = new String[3][3];
	
	public Velha() {
		for(int x = 0; x < Tabuleiro.length; x++) {
			for(int y = 0; y < Tabuleiro[x].length; y++) {
				Tabuleiro[x][y] = " ";
			}
		}
	}
	
	public void jogar() {
		if(jogador) {
			String x = JOptionPane.showInputDialog("Jogador 1 -> Informe posição x");
			int posicaox = Integer.parseInt(x);
			
			String y = JOptionPane.showInputDialog("Jogador 1 -> Informe posição y");
			int posicaoy = Integer.parseInt(y);
			
			
			if(verificaJogada(posicaox, posicaoy)) {
				Tabuleiro[posicaox][posicaoy] = "x";
				jogador =! jogador;
			} 
			
			else {
				this.jogar();
			}
		}
		
		else {
			String x = JOptionPane.showInputDialog("Jogador 2 -> Informe posição x");
			int posicaox = Integer.parseInt(x);
			
			String y = JOptionPane.showInputDialog("Jogador 2 -> Informe posição y");
			int posicaoy = Integer.parseInt(y);
			
			
			if(verificaJogada(posicaox, posicaoy)) {
				Tabuleiro[posicaox][posicaoy] = "y";
				jogador =! jogador;
			} 
			
			else {
				this.jogar();
			}
		}
		
	}
	
	public void mostrar() {
		for(int x = 0; x < Tabuleiro.length; x++) {
			System.out.println("");
			for(int y = 0; y < Tabuleiro[x].length; y++) {
				System.out.print(Tabuleiro[x][y] + "-");
			}
		}
	}
	
	public boolean verificaJogada(int posicaox, int posicaoy) {
		if(Tabuleiro[posicaox][posicaoy].equals(" ")) {
			return true;
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Posição inválida!");
			jogador =! jogador;
			return false;
		}
	}
	
	public void vencedor() {
		for (int v = 0; v < Tabuleiro.length; v++) {
			if(Tabuleiro[0][0].equals(Tabuleiro[0][0]) && Tabuleiro[0][1].equals(Tabuleiro[0][1]) && Tabuleiro[0][2].equals(Tabuleiro[0][2])) {
				JOptionPane.showMessageDialog(null, "Jogador vencedor");
			}
		}
	}
	
	public static void main(String args[]) {
		Velha v = new Velha();
		
		for(int i = 0; i < 9; i++) {
			v.jogar();
			v.mostrar();
			v.vencedor();
		}
	}
}
