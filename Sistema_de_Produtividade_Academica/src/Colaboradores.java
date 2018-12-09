import java.util.ArrayList;
import java.util.Scanner;

public class Colaboradores{
	public String nome;
	public String tipo;
	public String email;
	public String tipoproducao;
	public int flag = 0;
	public ArrayList<String> meusprojetos = new ArrayList<String>();
	public ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
	public ArrayList<Colaboradores> orientandos = new ArrayList<Colaboradores>();
	public Colaboradores orientador = new Colaboradores();

	
	
	
	public void AddColaborador() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do novo colaborador:");
		
		this.nome = scanner.nextLine();
		
		System.out.println("\nInforme o tipo do colaborador:\n"
				+ "(Tipos possíveis: Aluno de graduação, Aluno de mestrado, Aluno de doutorado, Professor e Pesquisador.)\n");
		
		this.tipo = scanner.nextLine();
		
		System.out.println("\nInforme o email do colaborador:");
		
		this.email = scanner.nextLine();
		
		System.out.println("Colaborador adicionado com sucesso!");
		
	}
	
	
}