#language: pt

@test
@order(3)
Funcionalidade: Fazer a compra de um produto

  Contexto:
    Dado que estou na pagina inicial

  Cenario: Adicionar um item no carrinho de compras
    Dado que clico na categoria monitores
    E clico no produto escolhido
    E clico em adicionar para o carrinho
    E valido a mensagem de confirmação
    E que clico no menu de carrinho
    E clico em fazer pedido
    E preencho os campos do formulário
    Quando clicar no botão comprar
    Entao deve exibir uma mensagem de sucesso