import java.util.ArrayList;

public class Laboratorio{
	public String nome;
	public ArrayList<Colaboradores> colaboradores = new ArrayList<Colaboradores>();
	public ArrayList<Projetos> projetos = new ArrayList<Projetos>();
	
	public void BuscarColaborador(String nome) {
		
		int i;
		
		for(i = 0; i < this.colaboradores.size(); i++) {
			if(nome.equals(this.colaboradores.get(i).nome)) {
				System.out.println(this.colaboradores.get(i).nome.toUpperCase());
				System.out.println(this.colaboradores.get(i).email);
			}
		}
	}
	
	
	public void BuscarProjeto(String titulo) {
		
		int i, j;
		
		for(i = 0; i < this.projetos.size(); i++) {
			if(titulo.equals(this.projetos.get(i).titulo)) {
				System.out.println(this.projetos.get(i).titulo.toUpperCase());
				System.out.println("Descrição: " + this.projetos.get(i).descricao);
				System.out.println("Objetivo: " + this.projetos.get(i).objetivo);
				System.out.println("Status: " + this.projetos.get(i).status);
				System.out.println("Início: " + this.projetos.get(i).datainicio + "/" + this.projetos.get(i).mesinicio + "/" + this.projetos.get(i).anoinicio);
				System.out.println("Término: " + this.projetos.get(i).datatermino + "/" + this.projetos.get(i).mestermino + "/" + this.projetos.get(i).anotermino);
				System.out.println("Agência financiadora: " + this.projetos.get(i).agenciafinanciadora);
				System.out.println("Valor financiado: $" + this.projetos.get(i).valorfinanciado);
				System.out.println("Participantes:");
				for(j = 0; j < this.projetos.get(i).participantes.size(); j++) {
					System.out.println("   " + this.projetos.get(i).participantes.get(j));
				}
				System.out.println("Produção acadêmica:");
			}
		}
		
		
	}
}