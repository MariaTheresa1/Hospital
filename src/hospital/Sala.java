package hospital;

public class Sala {
	private Integer andar;
	private Character bloco;
	private Integer numero;

	public Sala(Integer andar, Character bloco, Integer numero) {
		this.andar = andar;
		this.bloco = bloco;
		this.numero = numero;
	}
	
	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Character getBloco() {
		return bloco;
	}

	public void setBloco(Character bloco) {
		this.bloco = bloco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	void reservar(int dia, int mes, int ano) {
		
	}
}
