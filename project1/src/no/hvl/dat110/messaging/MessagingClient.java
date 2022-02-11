package no.hvl.dat110.messaging;

import java.net.Socket;

public class MessagingClient {
	
	private String server;
	private int port;
	
	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	// connect to messaging server
	public Connection connect () {
			
		Socket clientSocket;
		Connection connection = null;
		
		// TODO - START
		// create TCP socket for client and connection
		try {
			clientSocket = new Socket(server,port);
		}catch(Exception e) {
			clientSocket = null;
		}
		connection = new Connection(clientSocket);
		// TODO - END
		return connection;
	}
}
