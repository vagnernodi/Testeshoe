#Author: your.email@your.domain.com

Feature: Pesquisar no Google
 Eu como usuario quero acessar o site

 
  Scenario:Pesquisar no site  shoestock
    Given Que eu esteja no "https://www.shoestock.com.br/"
    When pesquisar bolsa
    Then Entao valido os produtos
   

