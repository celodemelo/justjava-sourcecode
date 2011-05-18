package br.com.justjava.validacao;

import java.util.ArrayList;
import java.util.List;

public class Validator {

	public List<ObjectValidator> validators;
	
	public Validator() {
		
		validators = new ArrayList<ObjectValidator>();
		validators.add(new StringValidator());
		validators.add(new NumberValidator());
	}
	
	public boolean validate(Object obj) {
		
		boolean isValid = false;
		
		for (ObjectValidator validator : validators){
			
			if (validator.canValidate(obj)){
				isValid = validator.validate(obj);
			}
			
		}
		
		return isValid;
	}

	public void addValidator(ObjectValidator newValidator) {
		validators.add(newValidator);
	}

}
