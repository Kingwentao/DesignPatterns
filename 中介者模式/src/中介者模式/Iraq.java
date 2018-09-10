package 中介者模式;

//伊拉克
public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
	}
	public void Declare(String message) {
		mediator.Declare(message, this);
	}
	public void getMessage(String message) {
	
		System.out.println("伊拉克获得对方的消息："+message);
	}
}
