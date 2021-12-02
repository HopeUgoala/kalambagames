**THIS IS A SIMPLE REST API THAT IMPLEMENT POST REQUEST**

  The rest API was implemented with Java springboot
  The dependencies are: Spring web, Spring Data JPA, PostgresSQL Driver
  
 This is where the magic start from, from the GamesControler class, the method registerNew get the parameter pass from the RequestBody
 
 ![image](https://user-images.githubusercontent.com/48040683/144424782-ca6818c9-22fb-42b9-a793-b2303dfbb54d.png)
 
 then passed the parameter to GamesService class
 
 ![image](https://user-images.githubusercontent.com/48040683/144426359-3eaedbfb-75db-4944-b9c7-9dbf86e7f740.png)

 then finally sent to the Gamesrepository class
 
 ![image](https://user-images.githubusercontent.com/48040683/144426624-6cc8f774-a7c5-4ddc-89fc-5fa5d1ed5d33.png)
 
 The implemetation was tested with Postman
 
 ![image](https://user-images.githubusercontent.com/48040683/144429228-f9c6e541-9d6f-4b72-9b81-dfb0c0d83e46.png)
 

RESULT
 
 ![image](https://user-images.githubusercontent.com/48040683/144429490-411ef4f5-e1e8-4930-b1b0-d8a75d67d9c2.png)



