package �۲���ģʽ;

public class ConcreteSubject extends Subject{

	//ʵ��֪ͨ�ķ���
	@Override
	public void notifyObserver() {
		System.out.println("Ŀ�����״̬�ѱ仯......����֪ͨ���۲�����");
		for(Object object:observers){
			((Observer)object).update();
		}
		
	}

}
