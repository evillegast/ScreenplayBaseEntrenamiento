#language: es

Característica: ingresar a la pagina practice.automationtesting
  Para validar los datos del usuario

  @EscenarioLogin
  Esquema del escenario: Acceso a la pagina Principal
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
      | <usuario>| <password> |
    Entonces veo el panel principal

    Ejemplos:
      | usuario | password |
      | Admin   | admin123 |

  @EscenarioCrearRegistro
  Escenario: Crear nuevo registro
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
      | <usuario>| <password> |
    Y crea el usuario
    Entonces el valida que se creo un nuevo registro

  @EscenarioEliminarRegistro
  Escenario: Eliminar Registro
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
      | <usuario>| <password> |
    Y elimina el registro
    Entonces el visualiza el mensaje success delete




