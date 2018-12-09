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
				+ " 5 - Adicionar publicação\n"
				+ " 6 - Adicionar orientação\n"
				+ " 7 - Consulta por colaborador\n"
				+ " 8 - Consulta por projeto\n"
				+ " 9 - Gerar relatório de produção acadêmica do laboratório\n"
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
				
				projeto.CriarNovoProjeto(lab);
				
				lab.projetos.add(projeto);
				
				break;
				
			case 3:
				
				System.out.println("Infome o projeto ao qual deseja alocar um colaborador:");
				
				String proj = scanner.nextLine();
				
				int i;
				
				for(i = 0; i < lab.projetos.size(); i++) {
					if(proj.equals(lab.projetos.get(i).titulo)) {
						lab.projetos.get(i).AlocarColaborador(lab.colaboradores);
					}
				}
				
				break;
				
			case 4:
				
				System.out.println("Infome o projeto cujo status deseja alterar:");
				
				String alterar = scanner.nextLine();
				
				for(i = 0; i < lab.projetos.size(); i++) {
					if(alterar.equals(lab.projetos.get(i).titulo)) {
						lab.projetos.get(i).AlterarStatus();
					}
				}
				
				break;
				
			case 5:
				
				Publicacoes publicacao = new Publicacoes();
				
				publicacao.AddPublicacao(lab);
				
				break;
				
			case 6:
				break;
				
			case 7:
				
				System.out.println("\nInforme o nome do colaborador:");
				
				String search = scanner.nextLine();
				
				lab.BuscarColaborador(search);
				
				break;
				
			case 8:
				
				System.out.println("Informe o título do projeto:");
				
				search = scanner.nextLine();
				
				lab.BuscarProjeto(search);
				
				break;
				
			}
			
				
			
			System.out.println("Informe a operação desejada:\n"
					+ " 1 - Adicionar um novo colaborador\n"
					+ " 2 - Criar novo projeto\n"
					+ " 3 - Alocar um colaborador a um projeto\n"
					+ " 4 - Alterar o status de um projeto\n"
					+ " 5 - Adicionar publicação\n"
					+ " 6 - Adicionar orientação\n"
					+ " 7 - Consulta por colaborador\n"
					+ " 8 - Consulta por projeto\n"
					+ " 9 - Gerar relatório de produção acadêmica do laboratório\n"
					+ " 0 - Sair\n");
			
		}
		
		
		scanner.close();
	}
	
	
}