package hello;


import java.util.List;
import java.util.LinkedList;

public class Model{
	
	private List<Vaga> vagas = new LinkedList<Vaga>();

	
	public void addVaga(Vaga vaga){
		vagas.add(vaga);
	}
	
	public List<Vaga> buscarLocal(String local){
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:vagas){
			 if(vaga.getLocal().contains(local)) vagasEncontrados.add(vaga);
		}
		
		return vagasEncontrados;
		
	}
	
	public List<Vaga> buscarTitulo(String titulo){
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:vagas) {
			if(vaga.getTitulo().contains(titulo)) vagasEncontrados.add(vaga);
		}
		return vagasEncontrados;
	}
	
	public List<Vaga> buscarEmpresa(Empresa emp){
		List<Vaga> vagasEncontrados = new LinkedList<Vaga>();
		
		for(Vaga vaga:vagas){
			 if(emp.comparar(vaga.getEmpr())) vagasEncontrados.add(vaga);
		}
		
		return vagasEncontrados;
		
	}
	
	public List<Vaga> getVagas(){
		return vagas;
	}

}
