package 中介者模式;


//美国
public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}
	public void Declare(String message) {
		mediator.Declare(message, this);
	}
	public void getMessage(String message) {
		System.out.println("美国获得对方的消息："+message);
	}
}
