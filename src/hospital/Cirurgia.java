package hospital;

public class Cirurgia {
	
	private String data;
	private Paciente paciente;
	private String descricao;
	
	public Cirurgia(String data, Paciente paciente, String descricao) {
		super();
		this.data = data;
		this.paciente = paciente;
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
