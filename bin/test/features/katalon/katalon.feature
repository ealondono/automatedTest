#Author: your.email@your.domain.com

@regresion
Feature: Title of your feature
  I want to use this template for my feature file

  @nombreObligatorio
  Scenario: nombreObligatorio
    Given quiero validar obligatoriedad del nombre
    When no escribo el nombre
    Then devo ver el mensaje This field is required

