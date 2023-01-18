package hospital;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	
	private List<Paciente> pacientes;

	public Fila() {
		pacientes = new ArrayList<>();;
	}
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente paciente) {
		this.pacientes.add(paciente);	
	}	
	
}
