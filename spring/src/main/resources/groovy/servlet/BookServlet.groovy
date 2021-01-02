package servlet

import org.gservlet.annotation.Servlet

@Servlet(value="/index.html")
class BookServlet {

  void get() {
	 xml.books {
		 sql.eachRow("select * from books") {
			 book(id: it.id, name : it.name, author : it.author)
		 }
	 } 
  }
   
}