import java.util.ArrayList;
import java.util.Scanner;

public class Projetos{
	public String titulo;
	public int datainicio;
	public int mesinicio;
	public int anoinicio;
	public int datatermino;
	public int mestermino;
	public int anotermino;
	public float valorfinanciado;
	public String agenciafinanciadora;
	public String objetivo;
	public String descricao;
	public String status;
	public ArrayList<Colaboradores> participantes = new ArrayList<Colaboradores>();
	
	public void CriarNovoProjeto() {
		
		System.out.println("\nInforme o t�tulo do novo projeto:");
		
		Scanner scanner = new Scanner(System.in);
		
		this.titulo = scanner.nextLine();
		
		System.out.println("\nInforme o objetivo do projeto:");
		
		this.objetivo = scanner.nextLine();
		
		System.out.println("\nD� uma descri��o ao projeto:");
		
		this.descricao = scanner.nextLine();
		
		System.out.println("\nInforme a ag�ncia financiadora:");
		
		this.agenciafinanciadora = scanner.nextLine();
		
		System.out.println("\nInforme a data de in�cio do projeto, dia, m�s e ano, cada um separado por uma quebra de linha:");
		
		this.datainicio = scanner.nextInt();
		
		this.mesinicio = scanner.nextInt();
		
		this.anoinicio = scanner.nextInt();
		
		System.out.println("\nInforme o valor financiado:");
		
		this.valorfinanciado = scanner.nextFloat();
		
		System.out.println("Novo projeto criado com sucesso!");
		
	}
}