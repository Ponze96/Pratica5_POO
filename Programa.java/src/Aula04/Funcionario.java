package Aula04;

public class Funcionario {
	
	String funcionario, departamento, dataEntrada, RG;
	double salario;
	boolean status;
	
	public void bonificar (double bonus) {
		salario = salario + bonus;
		
	}
	
	public void demitir() {
		this.status = false;
	}
	
	public void mostraDados() {
		System.out.println(funcionario + " " + departamento + " " + dataEntrada + " " + RG + " " 
				+ salario + " " + status);
	}

}
