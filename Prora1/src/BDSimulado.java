import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Ligacao> ligacoes = new ArrayList<Ligacao>();

	public BDSimulado() {

		// Criando Clientes
		Cliente c1 = new Cliente("Evandro da Silva", "987564123-89", LocalDate.of(1940, 9, 16), "1234-56789",
				"Rio de Janeiro", "RJ");
		Cliente c2 = new Cliente("Jo�o dos Montes", "457458459-45", LocalDate.of(2000, 1, 15), "1245-7896", "Brasilia",
				"DF");
		Cliente c3 = new Cliente("Maria do Socorro", "235678451-56", LocalDate.of(1988, 2, 26), "4758-6958", "Brasilia",
				"DF");
		Cliente c4 = new Cliente("Otaviano Neves", "895678451-91", LocalDate.of(1974, 4, 12), "2345-8945", "S�o Paulo",
				"SP");
		Cliente c5 = new Cliente("Jos� das Couves", "111222333-44", LocalDate.of(1991, 9, 29), "2583-6985", "Brasilia",
				"DF");
		Cliente c6 = new Cliente("Regina Maria", "123456789-00", LocalDate.of(1950, 11, 6), "3265-8974",
				"Belo Horizonte", "MG");

		// Armazenando clientes
		this.clientes.add(c1);
		this.clientes.add(c2);
		this.clientes.add(c3);
		this.clientes.add(c4);
		this.clientes.add(c5);
		this.clientes.add(c6);

		// Criando Ligacoes
		Ligacao l1 = new Ligacao(1, "1245-7896", LocalDateTime.of(2017, 9, 12, 17, 0),
				LocalDateTime.of(2017, 9, 12, 17, 55), "Brasilia", "DF", c1);
		Ligacao l2 = new Ligacao(2, "3265-8974", LocalDateTime.of(2017, 9, 12, 17, 10),
				LocalDateTime.of(2017, 9, 12, 17, 15), "Rio de Janeiro", "RJ", c2);
		Ligacao l3 = new Ligacao(3, "4758-6958", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 18, 12), "Brasilia", "DF", c1);
		Ligacao l4 = new Ligacao(4, "2345-8945", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 17, 14), "S�o Paulo", "SP", c6);
		Ligacao l5 = new Ligacao(5, "1245-7896", LocalDateTime.of(2017, 9, 12, 18, 45),
				LocalDateTime.of(2017, 9, 12, 19, 00), "Rio de Janeiro", "RJ", c3);
		Ligacao l6 = new Ligacao(6, "3265-8974", LocalDateTime.of(2017, 9, 12, 19, 21),
				LocalDateTime.of(2017, 9, 12, 19, 30), "S�o Paulo", "SP", c3);
		Ligacao l7 = new Ligacao(7, "1245-7896", LocalDateTime.of(2017, 9, 12, 19, 55),
				LocalDateTime.of(2017, 9, 12, 20, 30), "Brasilia", "DF", c4);
		Ligacao l8 = new Ligacao(8, "4758-6958", LocalDateTime.of(2017, 9, 12, 20, 0),
				LocalDateTime.of(2017, 9, 12, 20, 22), "Rio de Janeiro", "RJ", c1);
		Ligacao l9 = new Ligacao(9, "3265-8974", LocalDateTime.of(2017, 9, 12, 20, 13),
				LocalDateTime.of(2017, 9, 12, 20, 51), "Rio de Janeiro", "RJ", c6);
		Ligacao l10 = new Ligacao(10, "1245-7896", LocalDateTime.of(2017, 9, 12, 21, 4),
				LocalDateTime.of(2017, 9, 12, 23, 44), "Belo Horizonte", "MG", c4);
		Ligacao l11 = new Ligacao(11, "4758-6958", LocalDateTime.of(2017, 9, 12, 22, 13),
				LocalDateTime.of(2017, 9, 12, 22, 19), "Rio de Janeiro", "RJ", c3);
		Ligacao l12 = new Ligacao(12, "2345-8945", LocalDateTime.of(2017, 9, 13, 9, 25),
				LocalDateTime.of(2017, 9, 13, 10, 15), "S�o Paulo", "SP", c1);
		Ligacao l13 = new Ligacao(13, "1245-7896", LocalDateTime.of(2017, 9, 13, 14, 36),
				LocalDateTime.of(2017, 9, 13, 15, 55), "S�o Paulo", "SP", c6);
		Ligacao l14 = new Ligacao(14, "3265-8974", LocalDateTime.of(2017, 9, 13, 20, 01),
				LocalDateTime.of(2017, 9, 13, 22, 12), "S�o Paulo", "SP", c2);
		Ligacao l15 = new Ligacao(15, "1245-7896", LocalDateTime.of(2017, 9, 13, 21, 14),
				LocalDateTime.of(2017, 9, 13, 21, 56), "Brasilia", "DF", c1);
		Ligacao l16 = new Ligacao(16, "4758-6958", LocalDateTime.of(2017, 9, 14, 12, 0),
				LocalDateTime.of(2017, 9, 14, 12, 55), "Belo Horizonte", "MG", c6);
		Ligacao l17 = new Ligacao(17, "2345-8945", LocalDateTime.of(2017, 9, 14, 16, 32),
				LocalDateTime.of(2017, 9, 14, 17, 21), "Rio de Janeiro", "RJ", c4);
		Ligacao l18 = new Ligacao(18, "1245-7896", LocalDateTime.of(2017, 9, 14, 20, 34),
				LocalDateTime.of(2017, 9, 14, 20, 35), "Rio de Janeiro", "RJ", c2);
		Ligacao l19 = new Ligacao(19, "4758-6958", LocalDateTime.of(2017, 9, 15, 10, 47),
				LocalDateTime.of(2017, 9, 15, 11, 03), "S�o Paulo", "SP", c3);
		Ligacao l20 = new Ligacao(20, "3265-8974", LocalDateTime.of(2017, 9, 15, 23, 35),
				LocalDateTime.of(2017, 9, 15, 23, 55), "Brasilia", "DF", c1);

		// Armazenando Ligacoes
		this.ligacoes.add(l1);
		this.ligacoes.add(l2);
		this.ligacoes.add(l3);
		this.ligacoes.add(l4);
		this.ligacoes.add(l5);
		this.ligacoes.add(l6);
		this.ligacoes.add(l7);
		this.ligacoes.add(l8);
		this.ligacoes.add(l9);
		this.ligacoes.add(l10);
		this.ligacoes.add(l11);
		this.ligacoes.add(l12);
		this.ligacoes.add(l13);
		this.ligacoes.add(l14);
		this.ligacoes.add(l15);
		this.ligacoes.add(l16);
		this.ligacoes.add(l17);
		this.ligacoes.add(l18);
		this.ligacoes.add(l19);
		this.ligacoes.add(l20);
	}
	// --------------------------------------------------------------

	// Quest�o 2a : fun��o que retorne todas as informa��es de um Cliente
	// fornecido o seu nome
	public String getInfoCliente(String nome) {

		String resultado = "";
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getNome().equals(nome)) {
				resultado = this.clientes.get(i).toString();
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 2b: lista de todas as Liga��es realizadas por um Cliente
	// determinado
	public ArrayList<Ligacao> ligacoesPorCliente(String nome) {

		ArrayList<Ligacao> resultado = new ArrayList<Ligacao>();
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCliente().getNome().equals(nome)) {
				resultado.add(this.ligacoes.get(i));
			}

		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 2c: retorne o n�mero de liga��es realizadas por todos os Clientes
	// de uma determinada UF
	public int ligacoesPorUF(String UF) {

		int resultado = 0;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCliente().getUF().equals(UF)) {
				resultado++;
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 2d: todas as Liga��es onde a UF de origem seja diferente da UF de
	// destino
	public ArrayList<Integer> ligacoesUFDiferente() {

		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCliente().getUF() != this.ligacoes.get(i).getUFDestino()) {
				resultado.add(this.ligacoes.get(i).getCodigo());
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 3a:emitir a conta de um determinado Cliente, mostrando seus dados
	// pessoais e a lista de suas liga��es, onde, para cada liga��o, seja
	// mostrada a data e a hora em que a Liga��o foi iniciada, o n�mero de
	// destino e a cidade/UF de destino.
	public ArrayList<Ligacao> contaCliente(String nome) {

		ArrayList<Ligacao> resultado = new ArrayList<Ligacao>();
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCliente().getNome().equals(nome)) {
				resultado.add(this.ligacoes.get(i));
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 3b: cada minuto de uma liga��o custa R$0,05 para o Cliente,
	// altere (e/ou incremente) o c�digo da Quest�o 3a informando tamb�m o valor
	// de cada uma das liga��es realizadas.
	public double ValorLigacaoCliente(int codigoLigacao) {

		double resultado = 0.0;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCodigo() == codigoLigacao) {
				resultado = 0.05 * ((this.ligacoes.get(i).getDataHoraFim().getHour()
						- this.ligacoes.get(i).getDataHoraInicio().getHour())
						+ (this.ligacoes.get(i).getDataHoraFim().getMinute()
								- this.ligacoes.get(i).getDataHoraInicio().getMinute()));

			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 3c: Liga��es iniciadas depois das 20:00h. Para essas liga��es o
	// Cliente vai pagar apenas R$0,02 por minuto
	public double ValorLigacaoDesconto(int codigoLigacao) {

		double resultado = 0.0;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCodigo() == codigoLigacao) {
				// Testa se hora � maior que 20
				if (this.ligacoes.get(i).getDataHoraInicio().getHour() >= 20) {
					resultado = 0.02 * ((this.ligacoes.get(i).getDataHoraFim().getHour()
							- this.ligacoes.get(i).getDataHoraInicio().getHour())
							+ (this.ligacoes.get(i).getDataHoraFim().getMinute()
									- this.ligacoes.get(i).getDataHoraInicio().getMinute()));
				} else {
					resultado = 0.05 * ((this.ligacoes.get(i).getDataHoraFim().getHour()
							- this.ligacoes.get(i).getDataHoraInicio().getHour())
							+ (this.ligacoes.get(i).getDataHoraFim().getMinute()
									- this.ligacoes.get(i).getDataHoraInicio().getMinute()));
				}
			}
		}
		return resultado;
	}
	// --------------------------------------------------------------

	// Quest�o 3d: Caso o Cliente tenha mais de 65 anos de idade ele deve
	// receber um desconto extra de 15%
	public double ValorDescontoIdoso(int codigoLigacao) {

		double resultado = 0.0;
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCodigo() == codigoLigacao) {
				// Testa se hora � maior que 20
				if (this.ligacoes.get(i).getCodigo() == codigoLigacao) {
					// Testa se hora � maior que 20
					if (this.ligacoes.get(i).getDataHoraInicio().getHour() >= 20) {
						resultado = 0.02 * ((this.ligacoes.get(i).getDataHoraFim().getHour()
								- this.ligacoes.get(i).getDataHoraInicio().getHour())
								+ (this.ligacoes.get(i).getDataHoraFim().getMinute()
										- this.ligacoes.get(i).getDataHoraInicio().getMinute()));
					} else {
						resultado = 0.05 * ((this.ligacoes.get(i).getDataHoraFim().getHour()
								- this.ligacoes.get(i).getDataHoraInicio().getHour())
								+ (this.ligacoes.get(i).getDataHoraFim().getMinute()
										- this.ligacoes.get(i).getDataHoraInicio().getMinute()));
					}
				}
			}
			if (this.ligacoes.get(i).getCliente().getDataDeNascimento().getYear() <= 1952) {
				resultado = resultado * 0.015;
			}
		}
		return resultado;
	}
}