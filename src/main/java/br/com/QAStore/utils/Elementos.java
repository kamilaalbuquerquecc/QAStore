package br.com.QAStore.utils;

public class Elementos {
	
	//Login
	public String heardrLogin = "/html/body/div[3]/div[2]/div/div[1]/div[1]/div/h1/small";
	public String inputEmail = "//*[@id=\\\"id_email\\\"]";
	public String inputsenha = "//*[@id=\\\"id_senha\\\"]";
	public String buttonProsseguir = "/html/body/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/form/fieldset/div[2]/div/button";
	
	//Home
	public String headerBemVindo = "/html/body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]";
	public String title = "/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/h2/a";
	
	//Produto
	public String inputBuscar = "//*[@id=\"auto-complete\"]";
	public String buttonBuscar = "/html/body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div/form/button";
	public String nameProduto1 = "CATEGORIA] Produto com categoria principal - 3 Nível";
	public String nameProduto2 = "[CATEGORIA] Produto com categoria principal - 1 Nível";
	public String nameProduto3 = "[ESTOQUE] Produto com estoque gerenciado com quantidade zerada - Continua Vendendo";
	public String nameProduto4 = "[DIMENSÃO] Produto com altura 101";
	public String nameProduto5 = "[CORREIOS] Produto com dimensões/peso mínimo dos correios";
	public String buttonComprar = "/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[3]/a";
	
	//Carrinho
	public String tabelaProdutos = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table";
	public String inputCupom= "//*[@id=\"usarCupom\"]";
	public String buttonUsarCupom= "//*[@id=\"btn-cupom\"]";
	public String cupomDesconto = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/div/span";
	public String valorFrete= "/html/body/div[2]/div[2]/div/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/div/ul/li[2]/label/span[1]";
	public String buttonFinalizar= "/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[1]/button";
	public String buttonSubtotal = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[2]/div/strong";
	public String buttonTotal = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[7]/td/div[1]/strong";
	
	//FinalizaCompra
	public String tabelaProdutosCheckout = "/html/body/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div/table";
	public String pagamentoCartao = "//*[@id=\"radio-cartao\"]";
	public String pagamentoMercadoPago = "//*[@id=\"radio-mercadopagov1-18\"]";
	public String pagamentoboleto = "//*[@id=\"radio-mercadopagov1-520160\"]";
	public String finalizarCompraCheckout = "//*[@id=\"finalizarCompra\"]";
}