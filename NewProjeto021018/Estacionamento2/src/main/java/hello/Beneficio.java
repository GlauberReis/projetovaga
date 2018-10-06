package hello;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Beneficio {
	private double salario;
	private boolean convenioMedico;
	private boolean convenioOndotologico;
	private boolean refeicao;
	private double valorRefeicao;
	private boolean alimentacao;
	private double valorAlimentacao;
	private boolean auxilioEscola;
	private double valorAuxEscola;
	
	public Beneficio(double salario, boolean convenioMedico, boolean convenioOndotologico, boolean refeicao,
			double valorRefeicao, boolean alimentacao, double valorAlimentacao, boolean auxilioEscola,
			double valorAuxEscola) {
		this.salario = salario;
		this.convenioMedico = convenioMedico;
		this.convenioOndotologico = convenioOndotologico;
		this.refeicao = refeicao;
		this.valorRefeicao = valorRefeicao;
		this.alimentacao = alimentacao;
		this.valorAlimentacao = valorAlimentacao;
		this.auxilioEscola = auxilioEscola;
		this.valorAuxEscola = valorAuxEscola;
	}
}


