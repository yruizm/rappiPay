@Login
Feature: Pruebas Saucelabs
         Como usuario quiero iniciar sesion en Saucelabs

  @LoginSuccess
  Scenario:Login Exitoso
    Given que el usuario abre la aplicación
    When ingresa las credenciales de acceso "standard_user" y "secret_sauce"
    Then verifico que ingreso correctamente