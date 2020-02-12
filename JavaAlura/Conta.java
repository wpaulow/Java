/*struct Conta {
	int numero;
	double saldo;
}

//programar uma atm e a operação de saque

//atm.c

//e esse atm pegará a conta do usuário que quer sacar

Conta* c = pegaContaDoCartao();
double valor = pegaDoTeclado ();
c.saldo = c.saldo - valor;
emiteDinheiro(valor);

//saque efetuado na boca do caixa

//boca-do-caixa.c

Conta* c = passarCartaoECaixaAutoriza ();
double valor = caixaDigita ();
c.saldo = c.saldo - valor;
emiteDinheiro (valor);

Agora imagine que esse tenha sido um código legado, de forma estruturada, onde após ser implementado
precisasse incluir uma nova taxa, uma regra de negócio nova do banco, que cobrasse 0,10 centavos 
por saque. 
Por agora é fácil, porque o código está pequeno, mas em um grande código teria que ser alterado em dois
arquivos na linha de c.saldo = c.saldo -valor. No atm.c e no boca-do-caixa.c.
Isso acontece pois foi separado dados de comportamentos. Os dados no struct Conta e os comportamentos em 
outros arquivos.*/


class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;
	void deposita (double valorASerDepositado) { //void deixa claro que não devolve nada, só manipula um dado
		this.saldo += valorASerDepositado; //esse this. deixa bem claro ao Java que saldo é uma variável da classe conta. Deixa claro que this é uma variável que vive pra sempre
	}
}

class Programa {
	public static void main (String [] args) {
		Conta mauricio = new Conta (); //devolve uma conta
		mauricio.numero = 123; //nome da variável mais "." nome do atributo que se deseja modificar;
		mauricio.saldo = 800.0;
		mauricio.titular = "Mauricio Aniche";
		mauricio.agencia = 842;
		
		mauricio.deposita(100.0);
		
		Conta guilherme = new Conta ();
		guilherme.numero = 456;
		guilherme.saldo = 1200.0;
		
		//guilherme.saldo += 100.0; //pegar a regra de negócio de depósito e colocar perto da conta
		guilherme.deposita(100.0);
		
		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);
	}
}

