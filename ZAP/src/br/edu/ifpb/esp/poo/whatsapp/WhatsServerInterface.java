package br.edu.ifpb.esp.poo.whatsapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WhatsServerInterface extends Remote{

	public boolean cadastrarUsuario(
			String nomeUsuario) throws RemoteException;

	public long enviar(
			String msg, 
			String remetente, 
			String destinatario) throws RemoteException;
	
	public String status(long idMsg) throws RemoteException;
	
	public String[] contatos() throws RemoteException;
	
}
