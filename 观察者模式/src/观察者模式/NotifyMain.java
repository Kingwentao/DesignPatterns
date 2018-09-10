package 观察者模式;

public class NotifyMain {

	public static void main(String[] args) {

		Subject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver("观察者一号");
		Observer observer2=new ConcreteOberverOther("观察者二号");
		subject.attach(observer);
		subject.attach(observer2);
		subject.notifyObserver();
	}
}
