
@funcionais
Feature: Carrinho de Compras
	Sendo um usuário do site
	Quero pesquisar pelo produto desejado
	Para incluir no carrinho de compras         
    
   Scenario: Incluir Produto no carrinho sem informar cep de destino
    Given que pesquiso pelo produto "<produto>"
    When seleciono o produto "<produto>" 
    And  realizo a inclusao do produto "<produto>" no carrrinho
    Then tenho o produto "<produto>" incluido no carrinho para compra
    
    Scenario Outline: Verificar mensagem quando produto não possuir estoque
    Given que pesquiso pelo nome produto "<nome>"
    When seleciono a descricao do produto"<descricao>"
    Then visualizo a mensagem que o produto não possui estoque    
   
    Examples: 
      | produto  | nome | descricao|
      | name1    |      |          |
      | name2    |      |          |
