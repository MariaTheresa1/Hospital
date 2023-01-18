package hospital;

import java.util.List;

public class Fila {
	
	private List<Paciente> pacientes;

	public Fila() {
		pacientes = null;
	}
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente paciente) {
		this.pacientes.add(paciente);	
	}	
	
}
