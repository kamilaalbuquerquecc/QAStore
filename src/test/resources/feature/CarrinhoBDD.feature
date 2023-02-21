#language:pt
Funcionalidade: Cupom

	Contexto:
		Pré-condição: Usuário fez login no sistema
		Dado o usuário na interface de carrinho do sistema
		E este tem um produto adicionado
		
		Cenário: Inserir cupom [FRETEGRATIS]para carrinho com um produto
			Quando inserir o cupom “FRETEGRATIS”
			Então reflete o cupom no carrinho
			E o frete na modalidade SEDEX fica gratis.
			
		Cenário: Inserir cupom [10OFF]para carrinho com um produto
			Quando inserir o cupom “10OFF”
			Então reflete o cupom no carrinho
			E o desconto de 10% é aplicado para o produto.
			
		Cenário: Inserir cupom [30REAIS]para carrinho com um produto
			Quando inserir o cupom “30REAIS”
			Então reflete o cupom no carrinho
			E o desconto de 30 reais é aplicado para o produto.
			
		Cenário: Inserir cupom [20LIMITADO]para carrinho com um produto
			Quando inserir o cupom “FRETEGRATIS”
			Então não reflete o cupom no carrinho
			E retorna que cupom não foi encontrado. 
		
		Cenário: Inserir cupom [AJJFLWBHH]para carrinho com um produto
			Quando inserir o cupom “AJJFLWBHH”
			Então reflete o cupom no carrinho
			E o desconto de 5% é aplicado para o total da compra.
		
		Cenário: Inserir cupom [CUPOMVENCIDO]para carrinho com um produto
			Quando inserir o cupom “CUPOMVENCIDO”
			Então não reflete o cupom no carrinho
			E o sistema retorna que cupom não é válido.
		

	Contexto:
		Pré-condição: Usuário fez login no sistema
		Dado o usuário na interface de carrinho do sistema
		E este dois ou mais produtos adicionados
		
		Cenário: Inserir cupom [FRETEGRATIS]para carrinho com multiplos produtos
			Quando inserir o cupom “FRETEGRATIS”
			Então reflete o cupom no carrinho
			E o frete na modalidade SEDEX fica gratis.
			
		Cenário: Inserir cupom [10OFF] para carrinho com multiplos produtos
			Quando inserir o cupom “10OFF”
			Então reflete o cupom no carrinho
			E o desconto de 10% é aplicado para os produtos.
			
		Cenário: Inserir cupom [30REAIS] para carrinho com multiplos produtos
			Quando inserir o cupom “30REAIS”
			Então reflete o cupom no carrinho
			E o desconto 30 reais é aplicado para os produtos.
			
		Cenário: Inserir cupom [20LIMITADO]para carrinho com um produto
			Quando inserir o cupom “FRETEGRATIS”
			Então não reflete o cupom no carrinho
			E o sistema retorna que cupom não foi encontrado.
			
		Cenário: Inserir cupom [AJJFLWBHH] para carrinho com multiplos produtos
			Quando inserir o cupom “AJJFLWBHH”
			Então reflete o cupom no carrinho
			E o desconto de 5% é aplicado para o total da compra
			
		Cenário: Inserir cupom [CUPOMVENCIDO]para carrinho com multiplos produto
			Quando inserir o cupom “CUPOMVENCIDO”
			Então não reflete o cupom no carrinho
			E o sistema retorna que cupom não é válido.
