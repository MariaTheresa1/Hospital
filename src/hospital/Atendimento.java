package hospital;

import java.util.Date;

public class Atendimento {
	
	private Date data;
	private String descricao;
	
	public Atendimento(Date data, String descricao){
		this.data = data;
		this.descricao = descricao;
	}
	
	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
