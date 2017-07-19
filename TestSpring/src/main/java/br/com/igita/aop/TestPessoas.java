package br.com.igita.aop;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPessoas {

	public static void main(String[] args) {

		(new TestPessoas()).execute();
		
		
		System.exit(0);
		
	}
	
	@SuppressWarnings("resource")
	public void execute() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP_Bean_Profilador.xml");
		
		DAOPessoas dao = (DAOPessoas)applicationContext.getBean("daoPessoasProxy");
		
		File fileOut = new File("c:\\tmp\\pessoa.obj");
		
		Pessoa[] pessoas = new Pessoa[2];
		
		pessoas[0] = new Pessoa();
		pessoas[1] = new Pessoa();
		
		try {
			dao.persistir(pessoas, fileOut);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
// Obtenho a instancia do advice around
		AdviceAroundProfilador around = applicationContext.getBean(AdviceAroundProfilador.class);

/* 
	Se executei o método, o tempo de execução 
	obrigatoriamente precisa estar armazenado 
	na lista de tempos do advice around 
*/
		assert ! around.getTempos().isEmpty();
		
/*
 * Agora é testada a execução do advice before.
 * Tentaremos executar o método persistir no mesmo
 * arquivo usado anteriormente. Uma exceção do tipo
 * IllegalArgumentException deverá portanto ser disparada,
 * pois o parâmetro arquivo será substituído por null pelo advice.
 */

		try {
			dao.persistir(pessoas, fileOut);
		} catch (IllegalArgumentException | IOException e) {
			assert "Arquivo nulo foi passado".equals(e.getMessage());
		}
		
	}

}
