package br.com.igita.aop;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class AdviceAroundProfiladorAnotacoes {
	
	private List<Long> tempos = new ArrayList<Long>();

	public List<Long> getTempos() {
		return tempos;
	}

	public void setTempos(List<Long> tempos) {
		
		this.tempos = tempos;

	}
	
	@Around("execution(* br.com.igita.aop.DAOPessoas.* (..))")
	public Object profilar(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long momentoInicial = System.currentTimeMillis();
		
		Object resultado = joinPoint.proceed();
		
		long tempo = System.currentTimeMillis() - momentoInicial;
		
		tempos.add(tempo);
		
		System.out.println("Tempo para executar: " + tempo + "ms");
		
		return resultado;
		
	}


}
