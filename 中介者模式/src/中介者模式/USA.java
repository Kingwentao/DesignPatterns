package �н���ģʽ;


//����
public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}
	public void Declare(String message) {
		mediator.Declare(message, this);
	}
	public void getMessage(String message) {
		System.out.println("������öԷ�����Ϣ��"+message);
	}
}
