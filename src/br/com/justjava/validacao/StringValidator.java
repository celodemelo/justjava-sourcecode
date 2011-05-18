package br.com.justjava.validacao;

public class StringValidator implements ObjectValidator{

	@Override
	public boolean canValidate(Object obj) {
		return obj instanceof String;
	}

	@Override
	public boolean validate(Object obj) {
		String value = (String) obj;
		return !value.isEmpty();
	}

}
