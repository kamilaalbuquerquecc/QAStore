package br.com.QAStore.utils;

public class Elementos {
	
	//Login
	public String hearderLogin = "/html/body/div[3]/div[2]/div/div[1]/div[1]/div/h1/small";
	public String inputEmail = "//*[@id=\"id_email\"]";
	public String inputSenha = "//*[@id=\"id_senha\"]";
	public String buttonProsseguir = "/html/body/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/form/fieldset/div[2]/div/button";
	public String headerMinhaConta = "/html/body/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/h3";

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
	public String produto = "//*[@id=\"listagemProdutos\"]/ul/li[1]/ul/li[1]/div/a";
	public String buttonComprar = "/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[3]/a";
	
	//Carrinho
	public String tabelaProdutos = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table";
	public String inputCupom= "//*[@id=\"usarCupom\"]";
	public String buttonUsarCupom= "//*[@id=\"btn-cupom\"]";
	public String cupomDesconto = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/div/span";
	public String valorFrete= "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div/ul/li[2]/label/span[1]";
	public String buttonFinalizar= "/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[1]/button";
	public String valorSubtotal=    "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[2]/div/strong";
	public String valorTotal=       "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[5]/td/div[1]/strong";
	public String excluirProduto = "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[6]/div/a";
	public String excluirCupom= "/html/body/div[2]/div[2]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/div/a";
	public String alert = "/html/body/div[2]/div[2]/div/div[1]";
	public String x = "/html/body/div[2]/div[2]/div/div[1]/button"; 
	
	//FinalizaCompra
	public String tabelaProdutosCheckout = "/html/body/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/div/table";
	public String pagamentoCartao = "//*[@id=\"radio-cartao\"]";
	public String pagamentoMercadoPago = "//*[@id=\"radio-mercadopagov1-18\"]";
	public String pagamentoboleto = "//*[@id=\"radio-mercadopagov1-520160\"]";
	public String finalizarCompraCheckout = "//*[@id=\"finalizarCompra\"]";
}
