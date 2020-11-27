import org.gservlet.annotation.Servlet

@Servlet("/checkoutServlet")
class CheckoutServlet {

	void post() {
		def shoppingDetails = [:]
		shoppingDetails.name = request.name
		shoppingDetails.email = request.email
		shoppingDetails.address = request.address
		shoppingDetails.city = request.city
		shoppingDetails.state = request.state
		shoppingDetails.zip = request.zip
		shoppingDetails.cardname = request.cardname
		shoppingDetails.cardnumber = request.cardnumber
		shoppingDetails.expmonth = request.expmonth
		shoppingDetails.expyear = request.expyear
		shoppingDetails.sameAdress = request.sameadr
		shoppingDetails.cvv = request.cvv
		shoppingDetails.options = request.options
		session.shoppingDetails = shoppingDetails
		redirect(context.getContextPath() + "/checkoutServlet")
	}
	
	void get() {
		json(session.shoppingDetails)
	}

}