package Aula04;

public class Main {

	public static void main(String[] args) {
		Pessoa func1 = new Pessoa ("Joao", 192, 70);
		Pessoa func2 = new Pessoa("Gerald", 184, 80);
		Pessoa func3 = new Pessoa("Clayton", 190, 85);
		
		Pessoa[] pessoas = new Pessoa[10];
		for(int i=0; i<10; i++) {
			pessoas[i] = new Pessoa ("Pedro" + i,50, 1.70);
		}
		
		
	}

}
