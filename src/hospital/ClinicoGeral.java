package hospital;

public final class ClinicoGeral extends Medico {
	
	private String encaminhamento;
	
	public ClinicoGeral(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email,
			Double salario, String CRM, Sala sala) {
		super(CPF, nome, dataNascimento, telefone, endereco, email, salario, CRM, sala);
		encaminhamento = "";
	}

	public String getEncaminhamento() {
		return encaminhamento;
	}

	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}
	
	public void realizarEncaminhamento() {
		
	}
}
