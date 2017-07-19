package br.com.igita.aop;

public class TesteThrowsAdvice {

	public static void main(String[] args) {
		(new TesteThrowsAdvice()).execute();
	}

	private void execute() {
		
		System.out.println("Vai dar pau!");
		
		int i = 1/0;
		
	}
}
