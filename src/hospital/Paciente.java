package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
	
	private String nomeDoConvenio;
	private List<String> sintomas;
	private String diagnostico;
	
	public Paciente(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email, String nomeDoConvenio) {
		super(CPF, nome, dataNascimento, telefone, endereco, email);
		this.nomeDoConvenio = nomeDoConvenio;
		this.sintomas = new ArrayList<>();
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
	
	void realizarPagamento() {
		
	}
	
	@Override
	public String toString() {
	    return "CPF: " + getCPF() + "; Nome: " + getNome();
	}
	
	
}
