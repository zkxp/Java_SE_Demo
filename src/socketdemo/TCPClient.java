package socketdemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String sentence;
		String modifiedSentence;
		BufferedReader inFromClient=new BufferedReader(new InputStreamReader(System.in));
		Socket socketClient=new Socket("10.0.10.232",5555);
		BufferedReader inFromServer=new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
		DataOutputStream outToServer =new DataOutputStream(socketClient.getOutputStream());
		sentence=inFromClient.readLine();
		outToServer.writeBytes(sentence);
		modifiedSentence=inFromServer.readLine();
		System.out.println("server conten:"+modifiedSentence);
		
//		socketClient.close();
	}
}
