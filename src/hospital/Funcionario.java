package hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario extends Pessoa {
	
	private Double salario;
	private List<Atendimento> atendimentos;
	
	public Funcionario(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email, Double salario) {
		super(CPF, nome, dataNascimento, telefone, endereco, email);
		this.salario = salario;
		atendimentos = new ArrayList<>();
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Atendimento atendimento) {
		this.atendimentos.add(atendimento);
	}
	
	abstract void iniciarAtendimento();
}
