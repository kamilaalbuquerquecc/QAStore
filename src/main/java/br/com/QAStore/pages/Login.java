package br.com.QAStore.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.QAStore.core.Screen;
import br.com.QAStore.utils.DataHoraScreen;
import br.com.QAStore.utils.Elementos;
import junit.framework.Assert;

public class Login {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	public String email = "";
	public String senha = "";

	public Login() {

	}

	public Login(WebDriver driver, String url, String email, String senha) {
		Login.driver = driver;
		this.url = url;
		this.email = email;
		this.senha = senha;
	}
	
	public void login( ) throws IOException, InterruptedException  {
	
		System.out.println("Fazendo login na loja QA Store");
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Faça o seu login ou crie uma conta caso ainda não possua cadastro",driver.findElement(By.xpath((String.valueOf(e.hearderLogin)))).getText());
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "LOGIN.png");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.inputEmail)))).sendKeys(email);
		driver.findElement(By.xpath((String.valueOf(e.inputSenha)))).sendKeys(senha);
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "LOGIN_COM_CREDENCIAIS.png");
		
		driver.findElement(By.xpath((String.valueOf(e.buttonProsseguir)))).click();
		
		Thread.sleep(2000);	
		Assert.assertEquals("Minha Conta Confirme ou edite seus dados cadastrais."
				,driver.findElement(By.xpath((String.valueOf(e.headerMinhaConta)))).getText());	
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "DADOS_CLIENTE.png");
		
		driver.findElement(By.xpath((String.valueOf(e.title)))).click();
		
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "PAGINA_PRINCIPAL.png");
	}

	
		
}

