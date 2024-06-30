package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerc;

public class Main {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//instancia da lista de funcionarios 
		List <Funcionario> listafuncionario = new ArrayList<>();
		
		
		System.out.println("Insrira a quantidade de funcionários");
		int n = sc.nextInt();
		
		//inserindo dados na lista 
		for(int i = 0; i < n; i++) {
			System.out.println("insira o nome do funcionário " + (i+1));
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("insira o as horas trabalhadas do funcionário " + (i+1));
			double horas = sc.nextDouble();
			System.out.println("insira o valor por hora do funcionário " + (i+1));
			double valor = sc.nextDouble();
			System.out.println("Este funcionario é terceirizado? s/n");
			char terc = sc.next().charAt(0);
			if(terc == 's' || terc == 'S' ) {
				System.out.println("Insira a despesa desse funcionário");
				double despesa = sc.nextDouble();
				listafuncionario.add( new FuncionarioTerc(nome, horas, valor, despesa));
			}
			else {
				listafuncionario.add( new Funcionario(nome, horas, valor));
			}
		}
		
		//Percorrendo a lista e exibindo nome e pagamento
		System.out.println("Pagamentos: ");
		for(Funcionario fc : listafuncionario) {
			System.out.println(fc.getNome() + ": R$" +String.format("%.2f", fc.pagamento()));
		}
		

		sc.close();
	}
}
