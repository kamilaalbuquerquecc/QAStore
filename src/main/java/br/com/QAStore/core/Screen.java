package br.com.QAStore.core;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import br.com.QAStore.utils.Diretorio;

public class Screen {

	public static void take(WebDriver driver, String arquivo) throws IOException {
		//Cria evidencia
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			File screenshotLocation = new File(System.getProperty("user.dir") +"\\target\\Screenshot\\" +"//"+ Diretorio.nomePasta +"//"+arquivo);
			Files.copy(screenshot, screenshotLocation);
		}
		catch(Exception f) {
			System.out.println("Erro ao gravar arquivo na pasta " + f.getMessage());
		}
		
	}
	

}
