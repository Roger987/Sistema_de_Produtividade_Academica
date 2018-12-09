import java.util.ArrayList;
import java.util.Scanner;

public class Publicacoes{
	public String titulo;
	public String conferencia;
	public String projeto;
	public int ano;
	public ArrayList<String> autores = new ArrayList<String>();
	
	public void AddPublicacao(Laboratorio lab) {
		
		System.out.println("Informe o t�tulo da publica��o:");
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		
		String projetoassociado;
		
		this.titulo = scanner.nextLine();
		
		System.out.println("Informe o nome da confer�ncia onde foi publicada:");
		
		this.conferencia = scanner.nextLine();
		
		System.out.println("Est� associada a algum projeto? Digite 1 caso sim, e 2 caso n�o.");
		
		int proj = scanner.nextInt();
		scanner.nextLine();
		
		if(proj == 1) {
			
			System.out.println("Informe o t�tulo do projeto asociado � publica��o:");
			
			projetoassociado = scanner.nextLine();
			
			for(i = 0; i < lab.projetos.size(); i++) {
				if(projetoassociado.equals(lab.projetos.get(i).titulo) && lab.projetos.get(i).status.equals("Em andamento")) {
					this.projeto = projetoassociado;
					lab.projetos.get(i).publicacoes.add(this);
				}
			}
			
		}
		
		System.out.println("Informe o nome de todos os autores da publica��o, quando terminar digite 'Finalizar' para finalizar a opera��o.");
		
		String autor = null;
		
		while(!autor.equals("Finalizar")) {
			
			autor = scanner.nextLine();
			
			if(!autor.equals("Finalizar")) {
				
				for(i = 0; i < lab.colaboradores.size(); i++) {
					if(autor.equals(lab.colaboradores.get(i).nome)) {
						this.autores.add(autor);
						lab.colaboradores.get(i).publicacoes.add(this);
					}
				}
				
			}
			
		}
	}
	
}