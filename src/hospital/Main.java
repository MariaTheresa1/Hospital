package hospital;

public class Main {
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("111", "Maria", "01/01/2000", 
				"(99) 91111-2222", "Rua A, Centro, Teresina-PI", "maria@mail.com", "Unimed");
		
		Paciente paciente2 = new Paciente("222", "Pedro", "02/02/1999", 
				"(99) 98888-7777", "Rua B, Centro, Teresina-PI", "pedro@mail.com", "IAPEP");
		
		Paciente paciente3 = new Paciente("333", "Ana", "03/03/2003", 
				"(99) 95555-0000", "Rua C, Centro, Teresina-PI", "ana@mail.com", "Hapvida");
		
		Atendente atendente1 = new Atendente("444", "Marcos", "04/04/1997", 
				"(99) 96666-1111", "Rua D, Centro, Teresina-PI", "marcos@mail.com", 2000.00);
		
		Atendente atendente2 = new Atendente("555", "Carla", "05/05/2001", 
				"(99) 92222-3333", "Rua E, Centro, Teresina-PI", "carla@mail.com", 2000.00);
		
		Sala sala1 = new Sala(1, 'A', 101);
		Sala sala2 = new Sala(1, 'B', 102);
		Sala sala3 = new Sala(1, 'C', 103);
		
		Neuro neuro1 = new Neuro("666", "Antonio", "06/06/1995", 
				"(99) 94444-8888", "Rua F, Centro, Teresina-PI", "antonio@mail.com",
				9000.00, "0123", sala1);
		
		ClinicoGeral clinicogeral1 = new ClinicoGeral("777", "Patricia", "07/07/1992", 
				"(99) 97777-3333", "Rua G, Centro, Teresina-PI", "patricia@mail.com",
				7500.00, "4567", sala2);
		
		Cirurgiao cirurgiao1 = new Cirurgiao("888", "Marta", "08/08/1990", 
				"(99) 96666-1111", "Rua H, Centro, Teresina-PI", "marta@mail.com",
				12000.00, "7890", sala3, "coração");		
		
		Fila fila = new Fila();
		
		fila.setPacientes(paciente1);
		fila.setPacientes(paciente2);
		fila.setPacientes(paciente3);
		
		fila.exibirFila();
		
		Atendimento atendimento1 = new Atendimento("18/01/2023", "Cadastro de paciente");
		Atendimento atendimento2 = new Atendimento("17/01/2023", "Cadastro de paciente");
		
		atendente1.setAtendimentos(atendimento1);
		atendente1.setAtendimentos(atendimento2);
		
		System.out.println("\nAtendente:");
		System.out.println(atendente1);
		
		Atendimento atendimento3 = new Atendimento("16/01/2023", "Consulta");
		Atendimento atendimento4 = new Atendimento("13/01/2023", "Consulta e exame");
		
		neuro1.setAtendimentos(atendimento3);
		clinicogeral1.setAtendimentos(atendimento4);
				
		Cirurgia cirurgia1 = new Cirurgia("05/01/2023", paciente1 ,"Cirurgia do coração");
		
		cirurgiao1.setCirurgias(cirurgia1);
				
	}
}
