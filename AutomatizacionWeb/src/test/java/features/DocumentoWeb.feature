Feature: Creacion de documento

Scenario: Creacion de un documento web

Given Redireccion a la vista del buscador de Google "https://www.google.com/"
And Ir al menu de Google Apps
And Abrir Drive
When Acceder a la cuenta de Google con usuario "pruebatecnica.automatizacion@gmail.com" y la clave "Peru123."
And Crear un documento
Then Nombrar al documento "E01_Sady"
    


