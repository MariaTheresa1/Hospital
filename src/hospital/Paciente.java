package hospital;

import java.util.List;

public class Paciente extends Pessoa {
	
	private String nomeDoConvenio;
	private List<String> sintomas;
	private String diagnostico;
	
	public Paciente(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email, String nomeDoConvenio) {
		super(CPF, nome, dataNascimento, telefone, endereco, email);
		this.nomeDoConvenio = nomeDoConvenio;
		sintomas = null;
	}
	
	public String getNomeDoConvenio() {
		return nomeDoConvenio;
	}
	
	public void setNomeDoConvenio(String nomeDoConvenio) {
		this.nomeDoConvenio = nomeDoConvenio;
	}
	
	public List<String> getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(String sintoma) {
		this.sintomas.add(sintoma);
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
}
