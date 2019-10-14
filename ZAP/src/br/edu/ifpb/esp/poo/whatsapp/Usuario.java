package br.edu.ifpb.esp.poo.whatsapp;

public class Usuario {
	
	private String nomeUsuario;
	private int Senha;
	private boolean validaSenha;
	private int contato;
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getSenha() {
		return Senha;
	}
	public void setSenha(int senha) {
		Senha = senha;
	}
	public boolean isValidaSenha() {
		return validaSenha;
	}
	public void setValidaSenha(boolean validaSenha) {
		validaSenha = validaSenha;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Senha;
		result = prime * result + (validaSenha ? 1231 : 1237);
		result = prime * result + contato;
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Senha != other.Senha)
			return false;
		if (validaSenha != other.validaSenha)
			return false;
		if (contato != other.contato)
			return false;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		return true;
	}
	
	
	
	

}
