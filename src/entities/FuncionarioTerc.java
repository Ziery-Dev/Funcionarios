package entities;

public class FuncionarioTerc extends Funcionario {
	private Double valorDespesa; //indica o gasto do funcionario 

	//construtor
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
		//matem o método da super classe somado a 110 porcento da despesa do funcionario
		public double pagamento() {
			return super.pagamento() + (valorDespesa * 110 / 100);
		}
}
