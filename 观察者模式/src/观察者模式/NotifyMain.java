package �۲���ģʽ;

public class NotifyMain {

	public static void main(String[] args) {

		Subject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver("�۲���һ��");
		Observer observer2=new ConcreteOberverOther("�۲��߶���");
		subject.attach(observer);
		subject.attach(observer2);
		subject.notifyObserver();
	}
}
