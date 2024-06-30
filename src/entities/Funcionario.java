package entities;

public class Funcionario {
	private String nome;
	private Double horasTrab;
	private Double valorHora;
	
	
	//construtores
	public Funcionario() {
	}
	
	public Funcionario(String nome, Double horasTrab, Double valorHora) {
		super();
		this.nome = nome;
		this.horasTrab = horasTrab;
		this.valorHora = valorHora;
	}
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(Double horasTrab) {
		this.horasTrab = horasTrab;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	//metodos
	public double pagamento() {
		return valorHora * horasTrab;
	}
	
	
	
	
	
}
