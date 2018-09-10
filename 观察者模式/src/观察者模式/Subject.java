package �۲���ģʽ;

import java.util.ArrayList;


public abstract class Subject {
	protected ArrayList<Observer> observers=new ArrayList<>();
	//�ѹ۲��߶�����ӵ��۲��߼�����
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//�ѹ۲��߶����޳����۲��߼�����
		public void detach(Observer observer) {
			observers.remove(observer);
		}
	
		
		//�������󷽷�
		public abstract void notifyObserver();
}
