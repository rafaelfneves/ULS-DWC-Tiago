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
			OutputStream canalSa�da;
			BufferedReader entrada;
			PrintWriter sa�da;
			
			sckEcho = this.sckServidor.accept();
			canalEntrada = sckEcho.getInputStream();
			canalSa�da = sckEcho.getOutputStream();
			entrada = new BufferedReader(new InputStreamReader(canalEntrada));
			sa�da = new PrintWriter(canalSa�da, true);
			
			while (true) {
				String linhaPedido = entrada.readLine();
				
				if(linhaPedido == null || linhaPedido.length()== 0)
					break;
				
				String mensagem = linhaPedido;
				
				sa�da.println("Echo: "+ mensagem);		
			}
			sckEcho.close();
		}
		
	}
}


//Primeiro passo declarar objeto ServerSocket
//Porta 4000