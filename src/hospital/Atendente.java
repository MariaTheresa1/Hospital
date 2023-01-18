package hospital;

import java.util.ArrayList;

public class Atendente extends Funcionario {

	private Integer quantidadeDeHorasExtras;
	
	public Atendente(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email,
			Double salario) {
		super(CPF, nome, dataNascimento, telefone, endereco, email, salario);
		quantidadeDeHorasExtras = 0;
	}
	
	public Integer getQuantidadeDeHorasExtras() {
		return quantidadeDeHorasExtras;
	}

	public void setQuantidadeDeHorasExtras(Integer quantidadeDeHorasExtras) {
		this.quantidadeDeHorasExtras = quantidadeDeHorasExtras;
	}

	void iniciarAtendimento() {
		System.out.println("Olá! Você já tem cadastro ou é a primeira vez aqui?");
	}
	
	final Boolean cadastrarPaciente(ArrayList<Paciente> pacientes) {
		return true;
	}
}
