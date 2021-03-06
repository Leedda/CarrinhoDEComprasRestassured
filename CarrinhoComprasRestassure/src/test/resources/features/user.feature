@funcionais
Feature: Cadastrar usuario
  pretendendo ser um usuario do site
	Quero pesquisar pela cidade e estado desejada
	Para obter localizacao e temperatura
	
	
  Scenario Outline: Cadastra usuario
    Given Eu faco um POST "<v3/user>" com os seguintes valores:
    |City        |State  |Expected Behavior|
    |Round Rock  |TX     |200              |
    |Tampa       |TX     |404              |
    |  --        | --    |400              |
    
    
    And quando tenho esse outro usuario:
    """json
     {
       ["License": " ", 
       "City" : "Round Rock",
       "State" : "TX",
       "TempF" : "41.0",
       "TempC" : "5.0",
       "Weather" : "Partly Cloudy",
       "WindMPH" : "18.4",
       "WindDir" : "Southwest",
       "RelativeHumidity" : "53",
       "VisibilityMiles" : "10.00",
       "AirQualityIndex" : "32",
       "AirQualityCode" : "1",
       "AirQuality" : "Good",
       "Sunrise" : "05:56",
       "Sunset" : "20:16",
       "DaylightHours" : "14",
       "DaylightMinutes" : "19",
       "Code" : "Success",
       "Credits" : 74223]
    }
    """
    Then quando faco um GET para "<v3/user>", o usuario criado é retornado
    
    Scenario: cria um usuario
    When crio um usuario 
    Then recebo o status code
    And o usuario foi cadastrado
    