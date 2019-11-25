# How to build and create the Spring Boot Server application in a executable java jar file

Example: Eclipse, Run as, Maven build
https://www.youtube.com/watch?v=qDTUYkaXAEc


# Change default port value in application.properties

Use:
server.contextPath=/testar/1.0.0
server.port=8080

To: http://localhost:8080/testar/1.0.0/swagger-ui.html

Use:
server.contextPath=/testar/1.0.0
server.address=10.101.101.6
server.port=8090

To: http://10.101.101.6:8090/testar/1.0.0/swagger-ui.html


# Example TESTAR Web POST execution

Use:
params 
{
  "mode": "Generate",
  "sse": "web_generic",  
  "sequenceLength": 50,
  "sequences": 5,
  "suspiciousTitles": ".*[eE]rror.*|.*[eE]xcep[ct]i[o?]n.*|.*[bB]ortali.*",
  "testCaseName": "xxxx"
}

To:
testar.bat sse=web_generic Mode=Generate Sequences=5 SequenceLength=50 SuspiciousTitles=.*[eE]rror.*|.*[eE]xcep[ct]i[o?]n.*|.*[bB]ortali.*

# Other useful information

https://stackoverflow.com/questions/615948/how-do-i-run-a-batch-file-from-my-java-application