
public class RequestHandler {

	public static void processRequest(Request request) {
		IRequestHandler requestHandler=new UserNameAndPasswordHandler();
		requestHandler.handelRequest(request);
	}
	public static void main(String[] args) {
		Request request=new Request();
		request.setUserName(null);
		processRequest(request);
		
		Request request2=new Request();
		request2.setToken("jwt");
		processRequest(request2);
		
		Request request3=new Request();
		request3.setUserName("User");
		processRequest(request3);
		
		
	}
	
}
