class Programa {
	public static void main (String [] args) {
		int idadeJose = 18;
		int idadeMaria = 21;
		
		int somaDasIdades = idadeJose + idadeMaria;
		
		System.out.println (somaDasIdades);
		
		int numero = 10; //se a variável não é inicializada o programa dá erro
		System.out.println(numero);
		
		double pi = 3.1415;
		double dobroDoPi = pi *2;
		pi *= 2;
		
		System.out.println ("Double pi = " + dobroDoPi + " e pi com operador de atribuição *= é " + pi);
		
		boolean amigo = true;
		boolean inimigo = !amigo;
		
		boolean maiorDeIdade = idadeJose > 18; // >= , == , <= ...
		
		char letra = 'M';
		String nomeCompleto = "José da Silva";
		
		System.out.println (nomeCompleto);
		
		long copiaDeNumero = numero;
		
		System.out.println ("=====================================================");
		System.out.println ("=====================================================");
		////////////////////////////////////////////////////
		int idadeVisitante = 15;
		boolean amigoDoDono = true;
		int idadeVisitante2 = 72;
		
		/*Entra na festa, caso contrário, volta pra casa*/
		if (idadeVisitante >= 18 || amigoDoDono) {
			System.out.println ("Entre na festa!");
		} else {
			System.out.println ("Volte pra casa!");
		}
		
		if (idadeVisitante2 >= 18 && amigoDoDono) {
			System.out.println ("Aproveite a melhor idade!");
		} else {
			System.out.println ("Volte pra casa!");
		}
		
		//usando um loop: uma repetição de um trecho de código por um tempo determinado
		System.out.println ("=====================================================");
		System.out.println ("=====================================================");
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Parabéns pelo aniversário nº " + i + ". Usando o For.");
		}
		
		System.out.println ("=====================================================");
		System.out.println ("=====================================================");
		
		int j = 1;
		while (j <=100) {
			System.out.println("Parabéns pelo seu aniversário nº " + j + ". Usando o While.");
			j++;
		}
		
		System.out.println ("=====================================================");
		System.out.println ("=====================================================");
		
		int multiplicador = 3;
		for (int k = 0; k < 10; k++) {
			
			if (k % 2 == 0) {
				int numeroQualquer = 10;
				System.out.println (k * multiplicador);
				System.out.println (numeroQualquer);
			}
		}
		
		System.out.println ("=====================================================");
		System.out.println ("=====================================================");
		
		//O switch é como se fosse um if. Só que bem mais simples, pois só compara conteúdos. 
		//Diferentemente do if que compara valores booleanos. 
		//Apesar do switch existir, usamos muito pouco, pois é muito simples e é possível escrevê-lo de outra maneira.
		
		int num = 1;
		
		switch (num) {
			case 1:
				System.out.println("um");
				break;
			case 2: 
				System.out.println("dois");
				break;
			default:
				System.out.println("número grande");
		}
		
	}
}