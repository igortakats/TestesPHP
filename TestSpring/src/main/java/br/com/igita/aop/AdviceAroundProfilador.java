package br.com.igita.aop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 
 * Exemplo de Around Advice
 * 
 * @author ivanoff
 *
 */
public class AdviceAroundProfilador implements Serializable, MethodInterceptor{

	private static final long serialVersionUID = 2728674143350260957L;
	
	private List<Long> tempos = new ArrayList<>();
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		long momentoInicial = System.currentTimeMillis();
		
/*
 *        O método proceed executa a invocação do método
 *        que estamos interceptando nos fornecendo seu 
 *        valor de retorno.        
 *        Assim é possível, por exemplo, substituir o valor retornado 
 *        para a classe cliente do objeto proxiado ;)              
 */

		Object resultado = invocation.proceed();
		
		long tempo = System.currentTimeMillis() - momentoInicial;
		
		this.getTempos().add(tempo);
		
		System.out.println("Tempo para executar " + tempo + "ms");
		
/*  
   Na linha abaixo retornamos o resultado da invocação do 
   método interceptado  
*/
		
		return resultado;
		
	}
	
	public List<Long> getTempos() {
		return tempos;
	}

	public void setTempos(List<Long> tempos) {
		this.tempos = tempos;
	}
}
