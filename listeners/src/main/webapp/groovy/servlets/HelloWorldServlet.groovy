package servlets
import org.gservlet.annotation.Servlet

@Servlet(value="/index.html")
class HelloWordServlet {

  void get() {
     html.html {
       body {
         p("Hello World!")
       }
     } 
  }
 
    
}