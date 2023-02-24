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

//Todos os testes automatizdos encontram-se nesta classe.
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")
public class Teste extends BaseTeste {

	Elementos e = new Elementos();

	@Test
	public void testeCupomFreteGratis(@Param(name = "email") String email, @Param(name = "senha") String senha,
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException {
	
		login(email, senha);
		
		Produto produto = new Produto(driver);
		produto.pesquisarEInserirProduto(e.nameProduto1);
		
		Carrinho carrinho = new Carrinho(driver);
		carrinho.inserirCupom(cupom);
		carrinho.assertCupomFreteGratis();
		carrinho.excluirCupomDoCarrinho();
		carrinho.excluirProdutoDoCarrinho();

	}

	@Test
	public void testeCupom10off(@Param(name = "email") String email, @Param(name = "senha") String senha,
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException {
		login(email, senha);
		
		Produto produto = new Produto(driver);
		produto.pesquisarEInserirProduto(e.nameProduto2);
		
		Carrinho carrinho = new Carrinho(driver);
		carrinho.inserirCupom(cupom);
		carrinho.assertCupom10Off();
		carrinho.excluirCupomDoCarrinho();
		carrinho.excluirProdutoDoCarrinho();
	}

	@Test
	public void testeCupomVencido(@Param(name = "email") String email, @Param(name = "senha") String senha,
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException {
		
		login(email, senha);
		
		Produto produto = new Produto(driver);
		produto.pesquisarEInserirProduto(e.nameProduto3);
		
		Carrinho carrinho = new Carrinho(driver);
		carrinho.inserirCupom(cupom);
		carrinho.assertCupomVencido();
		carrinho.excluirProdutoDoCarrinho();
	}

	@Test
	public void testeCupomInvalido(@Param(name = "email") String email, @Param(name = "senha") String senha,
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException {
		
		login(email, senha);
		
		Produto produto = new Produto(driver);
		produto.pesquisarEInserirProduto(e.nameProduto4);
		
		Carrinho carrinho = new Carrinho(driver);
		carrinho.inserirCupom(cupom);
		carrinho.assertCupomInvalido();
		carrinho.excluirProdutoDoCarrinho();
	}


	public void login(String email, String senha) throws InterruptedException, IOException {
		Login l = new Login(driver, properties.getProperty("url.qastore.login"), email, senha);
		l.login();
		Thread.sleep(2000);
	}
}
