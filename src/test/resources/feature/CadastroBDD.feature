#language:pt
Funcionalidade: Cadastro

	Cenário: Cadastro de novo usuário
		Pré-condição: Usuário não tem cadastro no sistema
		Dado o usuário na tela de cadastro
		Quando informar os dados válidos
		Então o cadastro será feito 
		E o sistema retornará tela com informações do cadastro
