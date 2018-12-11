import java.util.ArrayList;

public class Laboratorio{
	public String nome;
	public int totalorientacoes = 0;
	public int totalpublicacoes = 0;
	public ArrayList<Colaboradores> colaboradores = new ArrayList<Colaboradores>();
	public ArrayList<Projetos> projetos = new ArrayList<Projetos>();
	
	
	public void BuscarColaborador(String nome) {
		
		int i, j, flag = 0;
		
		for(i = 0; i < this.colaboradores.size(); i++) {
			if(nome.equals(this.colaboradores.get(i).nome)) {
				flag++;
				System.out.println("\n" + this.colaboradores.get(i).nome.toUpperCase());
				System.out.println(this.colaboradores.get(i).email);
				this.colaboradores.get(i).OrdenarProjetos();
				System.out.println("Projetos: ");
				for(j = 0; j < this.colaboradores.get(i).meusprojetos.size(); j++) {
					System.out.println("   " + this.colaboradores.get(i).meusprojetos.get(j).titulo);
					System.out.println("          " + this.colaboradores.get(i).meusprojetos.get(j).descricao);
					System.out.println("          Ano de t�rmino: " + this.colaboradores.get(i).meusprojetos.get(j).anotermino);
				}
				this.colaboradores.get(i).OrdenarPublicacoes();
				System.out.println("Publica��es: ");
				for(j = 0; j < this.colaboradores.get(i).publicacoes.size(); j++) {
					System.out.println("   " + this.colaboradores.get(i).publicacoes.get(j).titulo);
					System.out.println("          Ano de publica��o: " + this.colaboradores.get(i).publicacoes.get(j).ano);

				}
			}
		}
		
		if(flag == 0) {
			System.out.println("\nN�o encontrado!");
		}
		
	}
	
	
	public void BuscarProjeto(String titulo) {
		
		int i, j, flag = 0;
		
		for(i = 0; i < this.projetos.size(); i++) {
			if(titulo.equals(this.projetos.get(i).titulo)) {
				flag++;
				System.out.println("\n" + this.projetos.get(i).titulo.toUpperCase());
				System.out.println("Descri��o: " + this.projetos.get(i).descricao);
				System.out.println("Objetivo: " + this.projetos.get(i).objetivo);
				System.out.println("Status: " + this.projetos.get(i).status);
				System.out.println("In�cio: " + this.projetos.get(i).datainicio + "/" + this.projetos.get(i).mesinicio + "/" + this.projetos.get(i).anoinicio);
				System.out.println("T�rmino: " + this.projetos.get(i).datatermino + "/" + this.projetos.get(i).mestermino + "/" + this.projetos.get(i).anotermino);
				System.out.println("Ag�ncia financiadora: " + this.projetos.get(i).agenciafinanciadora);
				System.out.println("Valor financiado: $" + this.projetos.get(i).valorfinanciado);
				System.out.println("Participantes:");
				for(j = 0; j < this.projetos.get(i).participantes.size(); j++) {
					System.out.println("   " + this.projetos.get(i).participantes.get(j).nome);
				}
				this.projetos.get(i).OrdenarPublicacoes();
				System.out.println("Publica��es:");
				for(j = 0; j < this.projetos.get(i).publicacoes.size(); j++) {
					System.out.println("   " + this.projetos.get(i).publicacoes.get(j).titulo);
					System.out.println("          Ano de publica��o: " + this.projetos.get(i).publicacoes.get(j).ano);

				}
			}
		}
		
		if(flag == 0) {
			System.out.println("\nN�o encontrado!");
		}
	
	}
	
}