package br.com.QAStore.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.QAStore.core.Screen;
import br.com.QAStore.utils.DataHoraScreen;
import br.com.QAStore.utils.Elementos;
import junit.framework.Assert;

public class Carrinho {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	
	public Carrinho() {

	}

	public Carrinho(WebDriver driver) {
		Carrinho.driver = driver;
	}

	public void inserirCupom(String cupom) throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.inputCupom)))).sendKeys(cupom);
		
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_USADO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.buttonUsarCupom)))).click();

	}

	public void excluirCupomDoCarrinho() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.excluirCupom)))).click();
		
		Thread.sleep(2000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_EXCLUIDO.png");
	}

	public void excluirProdutoDoCarrinho() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.excluirProduto)))).click();
		
		Thread.sleep(2000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "PRODUTO_EXCLUIDO.png");
		
		String mensagem = "Produto removido no carrinho.";
		Assert.assertTrue(driver.findElement(By.xpath((String.valueOf(e.alert)))).getText().contains(mensagem));
	}

	public void assertCupomInvalido() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		String mensagem = "Cupom não encontrado.";
		Assert.assertTrue(driver.findElement(By.xpath((String.valueOf(e.alert)))).getText().contains(mensagem));
		
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_INVALIDO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.x)))).click();
	}

	public void assertCupomVencido() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		String mensagem = "O cupom não é válido.";
		Assert.assertTrue(driver.findElement(By.xpath((String.valueOf(e.alert)))).getText().contains(mensagem));

		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_VENCIDO.png");
		
		driver.findElement(By.xpath((String.valueOf(e.x)))).click();
	}

	public void assertCupom10Off() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		Assert.assertEquals("R$ 80,00", driver.findElement(By.xpath((String.valueOf(e.valorSubtotal)))).getText());
		
		Thread.sleep(1000);
		Assert.assertEquals("R$ 72,00", driver.findElement(By.xpath((String.valueOf(e.valorTotal)))).getText());
		
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_10OFF.png");
	}

	public void assertCupomFreteGratis() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		Assert.assertEquals("R$ 0,00", driver.findElement(By.xpath((String.valueOf(e.valorFrete)))).getText());
		
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "CUPOM_FRETEGRATIS.png");
	}

}
