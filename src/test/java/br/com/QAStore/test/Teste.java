package br.com.QAStore.test;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.QAStore.base.BaseTeste;
import br.com.QAStore.pages.Carrinho;
import br.com.QAStore.pages.Login;
import br.com.QAStore.pages.Produto;
import br.com.QAStore.utils.Elementos;

//import br.com.QAStore.base.BaseTeste;
//import br.com.QAStore.pages.Login;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")

public class Teste extends BaseTeste {

	Elementos e = new Elementos();
	
	@Test
	public void testeCupomFreteGratis(@Param(name = "email") String email,@Param(name = "senha") String senha, 
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException{
		login(email,senha);
		pesquisarEInserirProduto(e.nameProduto1);
		inserirCupomEExcluirCupomEProduto(cupom);
		
		
	}

	public void testeCupom10off(){
		
	}


	public void testeCupomVencido(){
	
	}
	
	
	
	public void login(String email, String senha) throws InterruptedException, IOException  {
		Login l = new Login(driver, properties.getProperty("url.qastore.login"), email, senha);
		l.login();
		Thread.sleep(2000);
	}
	
	public void pesquisarEInserirProduto(String nameProduto) throws IOException, InterruptedException {
		Produto produto = new Produto(driver);
		produto.pesquisarProduto(nameProduto);
	}
	
	public void inserirCupomEExcluirCupomEProduto(String cupom) throws InterruptedException, IOException {
		Carrinho carrinho = new Carrinho(driver);
		carrinho.inserirCupom(cupom);
		carrinho.excluirCupomDoCarrinho();
		carrinho.excluirProdutoDoCarrinho();
		
	}
}
