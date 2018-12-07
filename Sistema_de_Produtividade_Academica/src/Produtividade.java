import java.util.Scanner;

public class Produtividade{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = -1;
		
		System.out.println("Bem-vind@! Digite o nome do laboratório:");
		
		String nomelab = scanner.nextLine();
		
		Laboratorio lab = new Laboratorio();
		
		lab.nome = nomelab;
		
		System.out.println("Informe a operação desejada:\n"
				+ " 1 - Adicionar um novo colaborador\n"
				+ " 2 - Criar novo projeto\n"
				+ " 3 - Alocar um colaborador a um projeto\n"
				+ " 4 - Alterar o status de um projeto\n"
				+ " 5 - Consulta por colaborador\n"
				+ " 6 - Consulta por projeto\n"
				+ " 7 - Gerar relatório de produção acadêmica do laboratório\n"
				+ " 0 - Sair\n");
		
		while(choice != 0) {
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
			
			case 1:
				
				Colaboradores colaborador = new Colaboradores();
				
				colaborador.AddColaborador();
				
				lab.colaboradores.add(colaborador);
				
				break;
				
			case 2:
				
				Projetos projeto = new Projetos();
				
				projeto.CriarNovoProjeto();
				
				lab.projetos.add(projeto);
				
				break;
			
			}
				
			
			System.out.println("\nInforme a operação desejada:\n"
					+ " 1 - Adicionar um novo colaborador\n"
					+ " 2 - Criar novo projeto\n"
					+ " 3 - Alocar um colaborador a um projeto\n"
					+ " 4 - Alterar o status de um projeto\n"
					+ " 5 - Consulta por colaborador\n"
					+ " 6 - Consulta por projeto\n"
					+ " 7 - Gerar relatório de produção acadêmica do laboratório\n"
					+ " 0 - Sair\n");
			
		}
		
		
		scanner.close();
	}
	
	
}