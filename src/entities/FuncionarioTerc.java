package entities;

public class FuncionarioTerc extends Funcionario {
	private Double valorDespesa; 

	//construtores
	public FuncionarioTerc() {
		super();
	}
	public FuncionarioTerc(String nome, Double horasTrab, Double valorHora, Double valorAdicional) {
		super(nome, horasTrab, valorHora);
		this.valorDespesa = valorAdicional;
	}
	
	
	//getters e stters
	public Double getValorAdicional() {
		return valorDespesa;
	}
	public void setValorAdicional(Double valorAdicional) {
		this.valorDespesa = valorAdicional;
	}
	
	//metodos
		@Override
		//sobreposição da classe pagamento
		public double pagamento() {
			return super.pagamento() + (valorDespesa * 110 / 100);
		}
}
