
public class UserNameAndPasswordHandler implements IRequestHandler {

	@Override
	public void handelRequest(Request request) {
		if(request.getUserName() !=null) {
			System.out.println(this.getClass().getSimpleName()+" Handled the request");
		}else {
			IRequestHandler requestHandler=new JWTTokenRequestHandler();
			requestHandler.handelRequest(request);
		}

	}

}
