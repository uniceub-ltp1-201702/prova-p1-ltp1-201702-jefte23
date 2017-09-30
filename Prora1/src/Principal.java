import java.util.ArrayList;

//  Prova 1 LTP

// Aluno: Jeft� Alves Lira de araujo
// RA: 21750454

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// Quest�o 2a :
		System.out.println("---------------- Quest�o 2a ----------------");
		System.out.println(bds.getInfoCliente("Evandro da Silva"));

		// Quest�o 2b :
		System.out.println("\n---------------- Quest�o 2b ----------------");
		ArrayList<Ligacao> ligacoesPorCliente = bds.ligacoesPorCliente("Evandro da Silva");
		for (int i = 0; i < ligacoesPorCliente.size(); i++) {
			System.out.println(ligacoesPorCliente.get(i));
		}

		// Quest�o 2c :
		System.out.println("\n---------------- Quest�o 2c ----------------");
		System.out.println("liga��es por UF: " + bds.ligacoesPorUF("DF"));

		// Quest�o 2d :
		System.out.println("\n---------------- Quest�o 2d ----------------");
		ArrayList<Integer> ligacoesUFDiferente = bds.ligacoesUFDiferente();
		for (int i = 0; i < ligacoesUFDiferente.size(); i++) {
			System.out.println(ligacoesUFDiferente.get(i));
		}

		// -----------------------------Quest�o 3-----------------------------

		// Quest�o 3a :
		System.out.println("\n---------------- Quest�o 3a ----------------");
		ArrayList<Ligacao> contaCliente = bds.contaCliente("Evandro da Silva");
		for (int i = 0; i < contaCliente.size(); i++) {
			System.out.println(contaCliente.get(i));

		}

		// Quest�o 3b :
		System.out.println("\n---------------- Quest�o 3b ----------------");

		ArrayList<Ligacao> contaCliente2 = bds.contaCliente("Evandro da Silva");
		for (int i = 0; i < contaCliente2.size(); i++) {
			System.out.println(contaCliente2.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoCliente(contaCliente.get(i).getCodigo()) + " R$"));
		}

		// Quest�o 3c :
		System.out.println("\n---------------- Quest�o 3c ----------------");
		ArrayList<Ligacao> contaCliente3 = bds.contaCliente("Regina Maria");
		for (int i = 0; i < contaCliente3.size(); i++) {
			System.out.println(contaCliente3.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorLigacaoDesconto(contaCliente3.get(i).getCodigo()) + " R$"));
		}

		// Quest�o 3d :
		System.out.println("\n---------------- Quest�o 3d ----------------");
		ArrayList<Ligacao> contaCliente4 = bds.contaCliente("Regina Maria");
		for (int i = 0; i < contaCliente4.size(); i++) {
			System.out.println(contaCliente4.get(i) + "ValorLigacaoCliente: "
					+ (bds.ValorDescontoIdoso(contaCliente4.get(i).getCodigo()) + " R$"));
		}

	}
}
