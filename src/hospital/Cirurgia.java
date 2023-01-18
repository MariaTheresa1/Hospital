package hospital;

import java.util.Date;

public class Cirurgia {
	
	private Date data;
	private Paciente paciente;
	private String descricao;
	
	public Cirurgia(Date data, Paciente paciente, String descricao) {
		super();
		this.data = data;
		this.paciente = paciente;
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
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
