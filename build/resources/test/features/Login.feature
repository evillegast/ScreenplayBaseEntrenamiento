#language: es

Característica: ingresar a la pagina practice.automationtesting
  Para validar los datos del usuario


  Esquema del escenario: Acceso a la pagina Principal
    Dado  que Actor accede a la web
    Cuando ingreso mis credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    Entonces veo el panel principal

    Ejemplos:
      | Usuario      | Password       |
      | evillegas438 | SemilleroSQA.* |
