#language: pt

@test
@order(2)
Funcionalidade: Fazer login com usuário Válido

  Contexto:
    Dado que estou na pagina inicial

  Cenario: criar cadastro de cliente
    Dado que clico no menu Log In
    E digito um usuário válido
    E digito uma senha válida
    Quando clico no botão Log in
    Entao deve exibir nome logado