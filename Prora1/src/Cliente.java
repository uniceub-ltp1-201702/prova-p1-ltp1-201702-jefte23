import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String CPF;
	private LocalDate dataDeNascimento;
	private String telefone;
	private String cidade;
	private String UF;
	private ArrayList<Ligacao> ligacoes = new ArrayList<Ligacao>();

	// ToString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", dataDeNascimento=" + dataDeNascimento + ", telefone="
				+ telefone + ", cidade=" + cidade + ", UF=" + UF + ", ligacoes=" + ligacoes + "]";
	}

	// Metodo Construtor
	public Cliente(String nome, String cPF, LocalDate dataDeNascimento, String telefone, String cidade, String uF,
			ArrayList<Ligacao> ligacoes) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
		this.ligacoes = ligacoes;
	}

	// Metodos Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public ArrayList<Ligacao> getLigacoes() {
		return ligacoes;
	}

	public void setLigacoes(ArrayList<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}

}
