package 职责链模式;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=0&&request<10){
			System.out.println("我是一号评委:1-10号我来处理,现在是选手"+request+"号");
		}else if (successor!=null) {
			successor.handleRequest(request);
		}
	}

}
