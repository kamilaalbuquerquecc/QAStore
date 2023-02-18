package br.com.QAStore.auxiliares;

import java.io.File;
import java.io.IOException;

//Classe que está configurado como será criado o diretorio para salvar as evidencias
public class Diretorio {
	
	public static String nomePasta;

	public static void criaDiretorio() throws IOException {
		// Cria Diretorio para cada vez que o teste é executado
		try {
			nomePasta = "Evidência" +  DataHoraScreen.dataHoraArquivo();
			File pasta = new File(System.getProperty("user.dir") +"\\target\\Screenshot\\" +"//"+ nomePasta);
			pasta.mkdir();
			 
		}
		catch(Exception f) {
			System.out.println("Erro ao criar pasta " + f.getMessage());
		}
			
	}
}
