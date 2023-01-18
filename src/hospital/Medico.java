package hospital;

import java.util.List;

public abstract class Medico extends Funcionario {
	
	private String CRM;
	private Boolean plantao;
	private Sala sala;
	
	public Medico(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email,
			Double salario, String CRM, Sala sala) {
		super(CPF, nome, dataNascimento, telefone, endereco, email, salario);
		this.CRM = CRM;
		plantao = false;
		this.sala = sala;
	}
	
	public String getCRM() {
		return CRM;
	}

	public Boolean getPlantao() {
		return plantao;
	}

	public void setPlantao(Boolean plantao) {
		this.plantao = plantao;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	String realizarDiagnostico(List<String> sintomas) {
		
		return "";
	}
	
	void iniciarAtendimento() {
		System.out.println("Olá! O que você está sentindo?");
	}
}
