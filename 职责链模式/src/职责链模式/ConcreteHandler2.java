package 职责链模式;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=10&&request<20){
			System.out.println("我是二号评委:10-20号我来处理,现在是选手"+request+"号");
		}else if (successor!=null) {
			successor.handleRequest(request);
		}
	}


}
