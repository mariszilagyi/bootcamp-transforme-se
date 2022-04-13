package aulas.regex;

public class Regex {
	
	private String email;
	private String ddd;
	private String numeroTelefone;

	public Regex(String email) {
		if(email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new TratamentoDasMinhasExceptions("Email inválido");	
		} 
		
		this.email = email;
	}
	

	public Regex(String ddd, String numeroTelefone) {
		if (ddd == null|| numeroTelefone == null) {
			throw new TratamentoDasMinhasExceptions("Telefone Inválido");
		}
		
		if(!ddd.matches("\\d{2}")) {
			throw new TratamentoDasMinhasExceptions("DDD inválido");
		}
		
		if(!numeroTelefone.matches("\\d{8}|\\d{9}")) {
			throw new TratamentoDasMinhasExceptions("Telefone Inválido");
		}
		
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
	}




	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "(" + this.ddd + ") " + this.numeroTelefone;
	}
	
	
	
	
	
	

	
	

}
