package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteEcho {

	public static void main(String[] args) {
	
	Socket socket;
	InputStream canalEntrada;
	OutputStream canalSa�da;
	BufferedReader entrada;
	PrintWriter sa�da;
	
	try {
		socket = new Socket("127.0.0.1", 4000);
		
		canalEntrada = socket.getInputStream();
		canalSa�da = socket.getOutputStream();
		
		entrada = new BufferedReader(new InputStreamReader(canalEntrada));
		sa�da = new PrintWriter(canalSa�da, true);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Envie uma mensagem:");
		String leitura = leitor.nextLine();
		sa�da.println(leitura);
		
		String resultado =  entrada.readLine();
		System.out.println(resultado);
		
		socket.close();
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}
}
}