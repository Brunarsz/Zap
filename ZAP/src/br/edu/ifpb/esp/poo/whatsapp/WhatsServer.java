package br.edu.ifpb.esp.poo.whatsapp;

public interface WhatsServer {
	
	public boolean cadastrarUsuario(
			String nomeString);
	
	
	public long enviar(
			String msg ,
			String remetente ,
			String destinatorio);
	
	public String status (long idMsg);
	
	public String [] contatos();
	
	
	
	
	
	public interface WhatsCliente {
		
		public String usu (String pessoa1String, String texto, String contatos);
		
		public String [] texto();
		
		public String [] listarContatos();

		public String[] conversasNaoLidas();
		
		public String[] conversas(String contato);
		
		public String [] notificacao(String mensagem, String contato );
		
		public String [] Grupo();
		
		public String [] adiciona(String contatos); 
		
		public String [] remove( String contatos);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
