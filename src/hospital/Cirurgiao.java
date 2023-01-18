package hospital;

import java.util.List;

public final class Cirurgiao extends Medico {
	
	private List<Cirurgia> cirurgias;
	private String especialidade;
	
	public Cirurgiao(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email,
			Double salario, String CRM, Sala sala, String especialidade) {
		super(CPF, nome, dataNascimento, telefone, endereco, email, salario, CRM, sala);
		this.especialidade = especialidade;
		cirurgias = null;
	}

	public List<Cirurgia> getCirurgias() {
		return cirurgias;
	}

	public void setCirurgias(Cirurgia cirurgia) {
		this.cirurgias.add(cirurgia);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
