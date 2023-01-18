package hospital;

public class Atendimento {
	
	private String data;
	private String descricao;
	
	public Atendimento(String data, String descricao){
		this.data = data;
		this.descricao = descricao;
	}
	
	public String getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Atendimento [Data: " + data + ", Descricao: " + descricao + "]";
	}
	
}
