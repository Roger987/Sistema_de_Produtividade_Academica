import java.util.ArrayList;
import java.util.Scanner;

public class Projetos{
	public String titulo = null;
	public int datainicio = 0;
	public int mesinicio = 0;
	public int anoinicio = 0;
	public int datatermino ;
	public int mestermino;
	public int anotermino;
	public float valorfinanciado = 0;
	public String agenciafinanciadora = null;
	public String objetivo = null;
	public String descricao = null;
	public String status = "Em elaboração";
	public ArrayList<Colaboradores> participantes = new ArrayList<Colaboradores>();
	public ArrayList<Colaboradores> orientadores = new ArrayList<Colaboradores>();
	
	public void CriarNovoProjeto(Laboratorio lab) {
		
		System.out.println("\nInforme o título do novo projeto:");
		
		Scanner scanner = new Scanner(System.in);
		
		this.titulo = scanner.nextLine();
		
		System.out.println("\nInforme o objetivo do projeto:");
		
		this.objetivo = scanner.nextLine();
		
		System.out.println("\nDê uma descrição ao projeto:");
		
		this.descricao = scanner.nextLine();
		
		System.out.println("\nInforme a agência financiadora:");
		
		this.agenciafinanciadora = scanner.nextLine();
		
		System.out.println("\nInforme a data de início do projeto, dia, mês e ano, cada um separado por uma quebra de linha:");
		
		this.datainicio = scanner.nextInt();
		scanner.nextLine();
		
		this.mesinicio = scanner.nextInt();
		scanner.nextLine();
		
		this.anoinicio = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("\nInforme o valor financiado:");
		
		this.valorfinanciado = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Você deve adicionar ao menos um professor orientador ao novo projeto. Informe o nome do professor:");
		
		String professor = scanner.nextLine();
		
		int i;
		
		for(i = 0; i < lab.colaboradores.size(); i++) {
			if(professor.equals(lab.colaboradores.get(i).nome) && "Professor".equals(lab.colaboradores.get(i).tipo)) {
				this.orientadores.add(lab.colaboradores.get(i));
				this.participantes.add(lab.colaboradores.get(i));
			}
		}
		
		System.out.println("Novo projeto criado com sucesso!");
		
	}
	
	public void AlocarColaborador(ArrayList<Colaboradores> colaboradores) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nInforme o nome do colaborador que deseja alocar ao projeto " + this.titulo +":");
		
		String nomecolaborador = scanner.nextLine();
		
		int i, flag = 0;
		
		for(i = 0; i < colaboradores.size(); i++) {
			if(nomecolaborador.equals(colaboradores.get(i).nome)) {
				this.participantes.add(colaboradores.get(i));
				System.out.println("\nSucesso!");
				flag++;
				if(colaboradores.get(i).tipo.equals("Professor")) {
					this.orientadores.add(colaboradores.get(i));
				}
			}
		}
		
		if(flag == 0) {
			System.out.println("Ops! Não encontrado!");
		}
	}
	
	public void AlterarStatus() {
		
		System.out.println("\nInforme o novo status do projeto:");
		
		Scanner scanner = new Scanner(System.in);
		
		String novostatus = scanner.nextLine();
		
		if(novostatus.equals("Em andamento") && this.titulo != null && this.agenciafinanciadora != null && this.anoinicio != 0 && this.objetivo != null && this.orientadores.size() > 0) {
			this.status = novostatus;
		}
		
		else if(novostatus.equals("Concluido") && this.status.equals("Em andamento")) {
			System.out.println("\nInforme a data de término do projeto, dia, mês e ano, cada um separado por uma quebra de linha:");
			this.datatermino = scanner.nextInt();
			this.mestermino = scanner.nextInt();
			this.anotermino = scanner.nextInt();
			scanner.nextLine();
			if(this.anotermino >= this.anoinicio) {
				this.status = novostatus;
			}
		}
		
		else {
			System.out.println("\nErro! Tente novamente!");
		}
	}
}