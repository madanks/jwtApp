# How to Run project 

Step 1: Clone project and set up projet
Step 2: Run Project spring-boot:run
Step 3: Sign up the app

          Content-Type: application/json
          POST
          {
             "username": "admin1",
              "password": "admin1"
          }
        http://localhost:8080/users/sign-up
      
      
Step 4: Login

          Content-Type: application/json
          POST
          {
             "username": "admin1",
              "password": "admin1"
          }
       http://localhost:8080/login
      #capture jwt in response header 
       
Step 5:  Add Task  without JWT token

        Content-Type: application/json
        POST
        Response:
        {
            "timestamp": 1521408456384,
            "status": 403,
             "error": "Forbidden",
              "message": "Access Denied",
             "path": "/tasks"
         }
        http://localhost:8080/tasks
      #  HTTP 403 Forbidden status is expected
      
      
Step 6:  Add Task  with JWT token

         Content-Type: application/json
          POST
          Authorization: Bearer xxx.yyy.zzz
          {
             "description": "Design Application"
          }
         http://localhost:8080/tasks
          # Remember to replace xxx.yyy.zzz with the JWT retrieved above
          
          
Step 7:  Get Task  without JWT token

         Content-Type: application/json
         GET
         Authorization: Bearer xxx.yyy.zzz
          
          # Remember to replace xxx.yyy.zzz with the JWT retrieved above
