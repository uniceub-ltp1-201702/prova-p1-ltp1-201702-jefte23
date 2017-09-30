import java.util.ArrayList;

//  Prova 1 LTP

// Aluno: Jefté Alves Lira de araujo
// RA: 21750454

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// Questão 2a :
		System.out.println("---------------- Questão 2a ----------------");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));

		// Questão 2b :
		System.out.println("\n---------------- Questão 2b ----------------");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Evandro da Silva");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		// Questão 2c :
		System.out.println("\n---------------- Questão 2c ----------------");
		System.out.println("ligações por UF: " + bds.ligacoesPorUF("DF"));

		// Questão 2d :
		System.out.println("\n---------------- Questão 2d ----------------");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Questão 3-----------------------------

		// Questão 3a :
		System.out.println("\n---------------- Questão 3a ----------------");
		ArrayList<Ligacao> contaCliente = bds.contaCliente("Evandro da Silva");
		for (int i = 0; i < contaCliente.size(); i++) {
			System.out.println(contaCliente.get(i));

		}

		// Questão 3b :
		System.out.println("\n---------------- Questão 3b ----------------");

		ArrayList<Ligacao> contaCliente2 = bds.contaCliente("Evandro da Silva");
		for (int i = 0; i < contaCliente2.size(); i++) {
			System.out.println(contaCliente2.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoCliente(contaCliente.get(i).getCodigo()) + " R$"));
		}

		// Questão 3c :
		System.out.println("\n---------------- Questão 3c ----------------");
		ArrayList<Ligacao> contaCliente3 = bds.contaCliente("Regina Maria");
		for (int i = 0; i < contaCliente3.size(); i++) {
			System.out.println(contaCliente3.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoDesconto(contaCliente3.get(i).getCodigo()) + " R$"));
		}

		// Questão 3d :
		System.out.println("\n---------------- Questão 3d ----------------");
		ArrayList<Ligacao> contaCliente4 = bds.contaCliente("Regina Maria");
		for (int i = 0; i < contaCliente4.size(); i++) {
			System.out.println(contaCliente4.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorDescontoIdoso(contaCliente4.get(i).getCodigo()) + " R$"));
		}

	}
}
