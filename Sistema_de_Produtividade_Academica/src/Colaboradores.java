import java.util.ArrayList;
import java.util.Scanner;

public class Colaboradores{
	public String nome;
	public String tipo;
	public String email;
	public String tipoproducao;
	public ArrayList<Projetos> meusprojetos = new ArrayList<Projetos>();
	
	
	public void AddColaborador() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do novo colaborador:");
		
		this.nome = scanner.nextLine();
		
		System.out.println("\nInforme o tipo do colaborador:\n"
				+ "(Tipos possíveis: Alunos de graduação, Alunos de mestrado, Alunos de doutorado, Professores e Pesquisadores.)\n");
		
		this.tipo = scanner.nextLine();
		
		System.out.println("\nInforme o email do colaborador:");
		
		this.email = scanner.nextLine();
		
		System.out.println("Colaborador adicionado com sucesso!");
		
	}
	
	
}