
public class JWTTokenRequestHandler implements IRequestHandler {

	@Override
	public void handelRequest(Request request) {
		if(request.getToken() !=null) {
			System.out.println(this.getClass().getSimpleName()+" Handled the request");
		}else {
			System.err.println("Invalid request");
		}

	}

}
