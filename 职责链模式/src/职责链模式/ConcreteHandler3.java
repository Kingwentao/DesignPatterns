package 职责链模式;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=20&&request<30){
			System.out.println("我是三号评委:20-30号我来处理,现在是选手"+request+"号");
		}else if (successor!=null) {
			successor.handleRequest(request);
		}
	}
	}
