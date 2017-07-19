package br.com.igita.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.igita.beans.FonteDados;
import br.com.igita.beans.FonteDeDadosArquivos;
import br.com.igita.beans.Processador;

public class TestFonteDadosArquivo {

	private ApplicationContext ctx;
	
	public static void main(String[] args) {
		(new TestFonteDadosArquivo()).execute();
	}
	
	public TestFonteDadosArquivo() {
		
		super();
		
		ctx = new ClassPathXmlApplicationContext("bean.xml");
		
	}
	
	private void execute() {
		
		this.procFonteDeDadoSimples();
		this.procFonteDeDadosComplexo();
		this.procInjecaoPorSetter();
		
	}
	
//	Fonte de dados Simples
	private void procFonteDeDadoSimples() {
	
		String msg = "#################### - Fonte de dados Simples - ####################";
		
		FonteDados fonteDados = (FonteDados)ctx.getBean("fonteDeDados");
		
		System.out.println(msg);
		System.out.println(fonteDados.getArquivo());
		
	}
	
//	Fonte de dados Complexo
	private void procFonteDeDadosComplexo() {
		
		String msg = "#################### - Fonte de dados Complexo - ####################";
		
		FonteDeDadosArquivos arqs = (FonteDeDadosArquivos)ctx.getBean("fonteDeDadosArquivo");
		
		System.out.println(msg);
		
		for (String a : arqs.getArquivos()) {
			System.out.println(a);
		}
		
	}
	
//	Injecao por Setter
	private void procInjecaoPorSetter() {
		
		String msg = "#################### - Injecao por Setter - ####################";
		
		Processador processador = (Processador)ctx.getBean("processadorSetter");
		
		System.out.println(msg);
		
		System.out.println(processador.getArquivo());
		System.out.println(processador.getImpressor());
		
	}
	

}
