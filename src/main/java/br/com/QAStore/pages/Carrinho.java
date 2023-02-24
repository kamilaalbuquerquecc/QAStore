package br.com.QAStore.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.QAStore.core.Screen;
import br.com.QAStore.utils.DataHoraScreen;
import br.com.QAStore.utils.Elementos;

public class Carrinho {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	//public String nameProduto = "";
	//public String senha = "";
	
	public Carrinho(){
		
	}
	
	public Carrinho(WebDriver driver) {
		Carrinho.driver = driver;
	}
	
	public void inserirCupom(String cupom) throws InterruptedException, IOException {
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath((String.valueOf(e.inputCupom)))).sendKeys(cupom);
		driver.findElement(By.xpath((String.valueOf(e.buttonUsarCupom)))).click();
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "CUPOM_INSERIDO.png");
	}
	
	public void excluirCupomDoCarrinho() throws InterruptedException, IOException {
		driver.findElement(By.xpath((String.valueOf(e.excluirCupom)))).click();
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "CUPOM_EXCLUIDO.png");
	}
	
	public void excluirProdutoDoCarrinho() throws InterruptedException, IOException {
		driver.findElement(By.xpath((String.valueOf(e.excluirProduto)))).click();
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "PRODUTO_EXCLUIDO.png");
	}
	
}
