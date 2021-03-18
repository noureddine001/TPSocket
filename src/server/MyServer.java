package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(1234) ;
		System.out.println("J'attend la connection....") ;
		Socket s = ss.accept() ;
		System.out.println("Connexion d'un client " + s.getRemoteSocketAddress()) ;
		InputStream is = s.getInputStream() ;
		OutputStream os = s.getOutputStream();
		System.out.println("L'attend que le client envoie un octet") ;
		int nb = is.read() ;
		System.out.println("Je recoie le message "+ nb) ;
		int res = nb*12 ;
		System.out.println("J'envoie la reponse "+ res) ;
		os.write(res);
		s.close();
	}

}
