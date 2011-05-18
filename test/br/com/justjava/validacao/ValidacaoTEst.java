package br.com.justjava.validacao;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoTEst {
	
	@Test
	public void validaObjetoNulo(){
		
		
		Object obj = null;
		
		Validator validator = new Validator();
		boolean isValid = validator.validate(obj);
		
		assertEquals(false, isValid);
		
	}
	

	@Test
	public void validaStringVazia(){
		
		
		String nome ="Marcelo";
		
		Validator validator = new Validator();
		boolean isValid = validator.validate(nome);
		
		assertEquals(true, isValid);
		
	}
	

	@Test
	public void validaNumeroPositivo(){
		
		int idade = 12;
		
		Validator validator = new Validator();
		boolean isValid = validator.validate(idade);
		
		assertEquals(true, isValid);
		
	}
	
	@Test
	public void validaCpf(){
		
		Cpf cpf = new Cpf("123.123.123-12");
		
		Validator validator = new Validator();
		validator.addValidator(new CpfValidator());
		
		boolean isValid = validator.validate(cpf);
		
		assertEquals(true, isValid);
		
	}
	
	
	
	

}
