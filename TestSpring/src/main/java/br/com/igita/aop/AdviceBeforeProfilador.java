package br.com.igita.aop;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 * Exemplo de Advice Before
 * 
 * @author ivanoff
 *
 */
public class AdviceBeforeProfilador implements Serializable, MethodBeforeAdvice {

	private static final long serialVersionUID = -7915192828690353108L;

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		if (method.getName().equals("persistir") && args.length > 1 && args[1] != null) {
			File arquivoAlvo = (File)args[1];
			if (arquivoAlvo.exists()) {
				System.out.println("Before Advice: arquivo ja existe");
				args[1] = null;
			}
		}
	}
}