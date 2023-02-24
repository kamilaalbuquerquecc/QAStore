#language:pt
Funcionalidade: Finalizar compra

	Contexto:
		Pré-condição: Usuário inseriu produtos no carrinho
		Dado o usuário na interface de carrinho do sistema
		E este tem produtos adicionado
		E a soma do valor dos produtos atinge o limite mínimo para compra
			
		Cenário: Ir para checkout com cupom inserido
			E este possui cupom
			Quando clica sobre o botão Finalizar compra
			Então o sistema retorna a interface de checkout
			E está contém informações sobre produtos, dados do usuário, entrega e modalidade de pagamento.
			
		Cenário: Ir para checkout sem cupom inserido
			E este não possui cupom
			Quando clica sobre o botão Finalizar compra
			Então o sistema retorna a interface de checkout
			E está contém informações sobre produtos, dados do usuário, entrega e modalidade de pagamento.
	
	Contexto:
		Pré-condição: Usuário acessou checkout
		Dado o usuário na interface de checkout do sistema
		
		Cenario: Finalizar compra na modalidade boleto
			Quando seleciona a modalidade de pagamento de Boleto Bancário
			E clica sobre o botão Finalizar compra
			Então a compra é finalizada
			
		Cenario: Finalizar compra na modalidade mercado pagos
			Quando seleciona a modalidade de pagamento de Boleto Bancário
			E clica sobre o botão Finalizar compra
			Então a compra é finalizada
			
		Cenario: Finalizar compra na cartão de credito
			Quando seleciona a modalidade de pagamento de Boleto Bancário
			E clica sobre o botão Finalizar compra
			Então a compra é finalizada

			

