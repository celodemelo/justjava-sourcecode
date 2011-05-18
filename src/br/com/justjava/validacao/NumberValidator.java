package br.com.justjava.validacao;

public class NumberValidator implements ObjectValidator{

	@Override
	public boolean canValidate(Object obj) {
		return obj instanceof Number;
	}

	@Override
	public boolean validate(Object obj) {
		Number value = (Number) obj;
		return value.doubleValue() > 0;
	}

}
