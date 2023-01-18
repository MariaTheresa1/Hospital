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
		System.out.println("Ol�! Voc� j� tem cadastro ou � a primeira vez aqui?");
	}
	
	final Boolean cadastrarPaciente(ArrayList<Paciente> pacientes) {
		return true;
	}

	@Override
	public String toString() {
		return "CPF: " + getCPF() + ", Nome: " + getNome()	
				+ ", Quantidade De Horas Extras: " + quantidadeDeHorasExtras + ", Salario: " + getSalario()
				 + "\nAtendimentos: " + getAtendimentos() + "\n";
	}
	
	
}
