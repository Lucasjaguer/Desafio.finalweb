#language: pt

# @test
# @order(4)
Funcionalidade: Fazer logout

  Contexto:
    Dado que estou na pagina inicial

  Cenario: Encerrar sessão do usuário
    Dado que clico em Log out
    Entao deve exibir o menu de Log in