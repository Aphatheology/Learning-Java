# Week 5 and 6

## Assignment for Week 5
Create a project and a servlet by following the structure of Java web server. The servlet should be map to url(e.g your name), then the response of the servlet should be full name in the servlet. Compile and deploy the servlet

## Assignment for Week 6
- Create a project following the server structure for Java Web. The web page should return anything of your choice.
- Create a Servlet and define a route. The first route should return an HTML form requesting for username and password.
- When the form is submitted, the body data of the form should logged to the console.


## Useful Command Lines
- To compile the Java file: `javac -cp "C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar" AphatheologyServlet.java`
- To update the compiled class in the Tomcat project folder: `Copy-Item -Path "Aphatheology-Servlet.class" -Destination "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\Aphatheology-Servlet\WEB -INF\classes"`
- To start the server: `cd C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin`
- Then run: `catalina start`

## Useful Tips
- Ensure no other project is running on localhost:8080 because that is Tomcat's default port