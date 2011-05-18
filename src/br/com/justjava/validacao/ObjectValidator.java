package br.com.justjava.validacao;

public interface ObjectValidator {

	boolean canValidate(Object obj);

	boolean validate(Object obj);

}
