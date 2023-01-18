package hospital;

public final class Neuro extends Medico {
	
	private String exameNeurologico;
	
	public Neuro(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email,
			Double salario, String CRM, Sala sala) {
		super(CPF, nome, dataNascimento, telefone, endereco, email, salario, CRM, sala);
		exameNeurologico = "";
	}

	public String getExameNeurologico() {
		return exameNeurologico;
	}

	public void setExameNeurologico(String exameNeurologico) {
		this.exameNeurologico = exameNeurologico;
	}
	
}
