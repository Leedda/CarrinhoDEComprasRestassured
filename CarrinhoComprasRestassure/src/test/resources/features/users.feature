
Feature: Carrinho de Compras
  Sendo um usu�rio do site
	Quero pesquisar pelo produto desejado
	Para incluir no carrinho de compras
	
	@api
  Scenario: Validar usuario
    Given efetuo o cadastro de usuario 
    And verifico o retorno  
    When cunsultar usuario
    Then devo obter o retorno 
    And dados são gravados corretamente
    
    
    
    