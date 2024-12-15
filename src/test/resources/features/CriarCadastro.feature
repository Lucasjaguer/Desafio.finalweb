#language: pt

@test
@order(1)
Funcionalidade: Criar um cadastro de cliente válido

  Contexto:
    Dado que estou na pagina inicial

  Cenario: criar cadastro de cliente
    Dado que clico no botão signup
    E digito um nome no campo name
    E digito uma senha no campo password
    Quando clico no botão signup
    Entao deve exibir um aviso de sucesso
