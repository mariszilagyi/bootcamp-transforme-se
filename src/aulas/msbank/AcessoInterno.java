package aulas.msbank;

public interface AcessoInterno {
	
	
	/**
	 * 
	 * @param String usuario => pode-se informar um usuário válido
	 * @param String senha => pode-se informar uma senha com até 255 caracteres alfanumericos
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	public boolean autenticarSistema(String usuario, String senha);
	
	public boolean alterarSenha(String usuario, String senha, String novaSenha);
	
	public boolean alterarUsuario(String usuario, String senha, String novoUsuario);

}
