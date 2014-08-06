package socketdemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		String sentence,modifiedSentence;
		ServerSocket serverSocket=new ServerSocket(5555);
		while(true){
			Socket socket=serverSocket.accept();
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			DataOutputStream outToClient=new DataOutputStream(socket.getOutputStream());
			
			sentence=inFromClient.readLine();
			modifiedSentence=sentence.toUpperCase();
			
			outToClient.writeBytes(modifiedSentence);
			
		}
	}
}
