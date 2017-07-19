package br.com.igita.aop;

import java.io.Serializable;

import org.springframework.aop.ThrowsAdvice;

public class AdviceAfterThrow implements Serializable, ThrowsAdvice {

	private static final long serialVersionUID = 4639781363398875L;
	
	public void afterThrowing(Exception e) {
		System.out.println("Uma excecao ocorreu: " + e.getMessage());
	}

	public void afterThrowing(ArithmeticException e) {
		System.out.println("Uma excecao ocorreu: " + e.getMessage());
	}
}
