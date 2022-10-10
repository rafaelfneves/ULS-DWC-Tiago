package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEcho {

	private ServerSocket sckServidor;
	public ServidorEcho() throws IOException {
		this.sckServidor = new ServerSocket(4000);
	
		for(;;) {
			Socket sckEcho;
			InputStream canalEntrada;
			OutputStream canalSaída;
			BufferedReader entrada;
			PrintWriter saída;
			
			sckEcho = this.sckServidor.accept();
			canalEntrada = sckEcho.getInputStream();
			canalSaída = sckEcho.getOutputStream();
			entrada = new BufferedReader(new InputStreamReader(canalEntrada));
			saída = new PrintWriter(canalSaída, true);
			
			while (true) {
				String linhaPedido = entrada.readLine();
				
				if(linhaPedido == null || linhaPedido.length()== 0)
					break;
				
				String mensagem = linhaPedido;
				
				saída.println("Echo: "+ mensagem);		
			}
			sckEcho.close();
		}
		
	}
}


//Primeiro passo declarar objeto ServerSocket
//Porta 4000