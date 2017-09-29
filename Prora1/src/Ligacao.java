import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ligacao {

	private String codigo;
	private String TelefoneDestino;
	private LocalDate DataInicio;
	private LocalDateTime HoraInicio;
	private LocalDate DataFim;
	private LocalDateTime HoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente cliente;

	// Metodo ToString+
	@Override
	public String toString() {
		return "Ligacao [codigo=" + codigo + ", TelefoneDestino=" + TelefoneDestino + ", DataInicio=" + DataInicio
				+ ", HoraInicio=" + HoraInicio + ", DataFim=" + DataFim + ", HoraFim=" + HoraFim + ", cidadeDestino="
				+ cidadeDestino + ", UFDestino=" + UFDestino + ", cliente=" + cliente + "]";
	}

	// Metodo Construtor
	public Ligacao(String codigo, String telefoneDestino, LocalDate dataInicio, LocalDateTime horaInicio,
			LocalDate dataFim, LocalDateTime horaFim, String cidadeDestino, String uFDestino, Cliente cliente) {
		super();
		this.codigo = codigo;
		TelefoneDestino = telefoneDestino;
		DataInicio = dataInicio;
		HoraInicio = horaInicio;
		DataFim = dataFim;
		HoraFim = horaFim;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.cliente = cliente;
	}

	// Metodo Get's e Set's
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTelefoneDestino() {
		return TelefoneDestino;
	}

	public void setTelefoneDestino(String telefoneDestino) {
		TelefoneDestino = telefoneDestino;
	}

	public LocalDate getDataInicio() {
		return DataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		DataInicio = dataInicio;
	}

	public LocalDateTime getHoraInicio() {
		return HoraInicio;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		HoraInicio = horaInicio;
	}

	public LocalDate getDataFim() {
		return DataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		DataFim = dataFim;
	}

	public LocalDateTime getHoraFim() {
		return HoraFim;
	}

	public void setHoraFim(LocalDateTime horaFim) {
		HoraFim = horaFim;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getUFDestino() {
		return UFDestino;
	}

	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
