package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class MyClient {

	public static void main(String[] args) throws Exception {
		System.out.println("Je me connecte au serveur") ;
		Socket  socket = new Socket("localhost",1234) ;
		System.out.println("Connexion d'un client " + socket.getRemoteSocketAddress()) ;
		InputStream is = socket.getInputStream() ;
		OutputStream os = socket.getOutputStream() ;
		/*
		 *  Saisir un nomber au clavier 
		 */
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Donner un nomber :") ;
		int nb = scanner.nextInt();
		
		System.out.println("J'envoie le nombre " + nb + "au serveur ") ;
		os.write(nb) ;
		System.out.println("J'attend la reponse du serveur..");
		int rep = is.read();
		System.out.println("Reponse du serveur est " + rep) ;

	}

}
