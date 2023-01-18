package hospital;

public abstract class Pessoa {
	private String CPF;
	private String nome;
	private String dataNascimento;
	private String telefone;
	private String endereco;
	private String email;	
	
	public Pessoa(String CPF, String nome, String dataNascimento, String telefone, String endereco, String email) {
		this.CPF = CPF;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	
	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
