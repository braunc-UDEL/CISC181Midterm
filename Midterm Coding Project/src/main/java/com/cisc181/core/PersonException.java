package com.cisc181.core;
import java.time.Year;
import java.util.regex.Pattern;

public class PersonException extends Exception{
	private Person Person;
	private String regex = "^\\((\\d{3})\\)[- ](\\d{3})[- ](\\d{4})$";
	Pattern pattern = Pattern.compile(regex);
	
	public PersonException(Person Person) throws Exception
	{
		this.Person = Person;
		
		if (Year.now().getValue() - Person.getDOB().getYear() < 17)
		{
			throw new Exception("older than 100");
		}
		
		String[] number = {Person.getPhone()};
		
		for (String str : number) {
		    if (pattern.matcher(str).matches()) {        
		    } else {
		        throw new Exception("number not formatted");    
		    }
		}
	}
}
