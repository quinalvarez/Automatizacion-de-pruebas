#language: en
Feature: Logueo en cuenta test

Scenario:
  Given Que el login este disponible
  When Completo usuario y password
  And Click iniciar sesion
  And Cerrar ventanas sin cerrar demas sesiones
  And Prueba actual