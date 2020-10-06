Feature: Api Swagger UI

@Success
  Scenario Outline: Obtener token
    When realizo una petición <endpoint> al entity <entity> con la siguiente request <request>
    Then compruebo que el status code <statusCode> sea el esperado
    And guardo el Token generado

    Examples:
      | endpoint | request             | entity      | statusCode |
      | POST     | request/createToken | CREATETOKEN | 200        |

@Success
  Scenario Outline: Obtener usuario
    When realizo una petición <endpoint> al entity <entity> con la siguiente request <request>
    Then compruebo que el status code <statusCode> sea el esperado

    Examples:
      | endpoint | request                | entity | statusCode |
      | GET      | request/obtenerUsuario | USER   | 200        |