package br.com.QAStore.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.QAStore.core.Screen;
import br.com.QAStore.utils.DataHoraScreen;
import br.com.QAStore.utils.Elementos;


public class Produto {
	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	
	public Produto(){
		
	}
	
	public Produto(WebDriver driver) {
		Produto.driver = driver;
	}
	
	public void pesquisarProduto(String nameProduto) throws IOException, InterruptedException {
		
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath((String.valueOf(e.inputBuscar)))).sendKeys(nameProduto);
		driver.findElement(By.xpath((String.valueOf(e.buttonBuscar)))).click();
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "BUSCA_PRODUTO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.produto)))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.buttonComprar))));
		
	}
	public void inserirProduto() throws IOException, InterruptedException {
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "PRODUTO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.buttonComprar)))).click();
		Thread.sleep(2000);	
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "CARRINHO.png");
	}
	
	public void pesquisarEInserirProduto(String nameProduto) throws IOException, InterruptedException {
		
	    pesquisarProduto(nameProduto);
		inserirProduto();
	}

}
