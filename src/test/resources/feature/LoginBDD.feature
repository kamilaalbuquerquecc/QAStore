#language:pt
Funcionalidade: Login

	Cenário: Login no sistema
		Pré-condição: Usuário já tem cadastro no sistema
		Dado o usuário na tela de login
		Quando informar as credenciais validas
		Então o login será feito 
		E o sistema retornará tela com informações do cadastro
