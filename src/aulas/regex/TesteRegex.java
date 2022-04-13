package aulas.regex;

public class TesteRegex {
	
	public static void main(String[] args) {
		
		Regex emailValido = new Regex("mariana@gmail.com");
		Regex emailInvalido = new Regex("marianagmail.com");
		
		
		System.out.println(emailInvalido.getEmail());
		System.out.println(emailValido.getEmail());
		
		Regex telefoneValido = new Regex("69", "992293788");
		System.out.println(telefoneValido.toString());
		
		Regex telefoneInvalido = new Regex("69", "9992293788");
		System.out.println(telefoneInvalido.toString());
		
		
		
		
	
	}
	
	
	


}
