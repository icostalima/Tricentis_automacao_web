
@tricent
Feature: Cadastro de seguro no site Tricent
  Eu como interssado em fazer um de seguro, quero poder 
  realizar o cadastro e enviar o email com sucesso.
   
  @00001
  Scenario: Cadastro e envio de email
    Given que estou na pagina de cadastro do seguro tricentis
    When preencho o formulario da pagina enter vehicle data
    And preencho o formulario da pagina enter insurant data
    And preencho o formulario da pagina enter product data
    And seleciono o preco na pagina select price option
    And preencho o formulario da pagina send quote e envio
    Then valido a mensagem sending email success
    
