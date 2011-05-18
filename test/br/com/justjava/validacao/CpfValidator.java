package br.com.justjava.validacao;

public class CpfValidator implements ObjectValidator{

	@Override
	public boolean canValidate(Object obj) {
		return obj instanceof Cpf;
	}

	@Override
	public boolean validate(Object obj) {
		Cpf value = (Cpf) obj;
		return value.getNumero().length() == 14;
	}

}
