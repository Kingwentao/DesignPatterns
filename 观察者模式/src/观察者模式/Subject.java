package 观察者模式;

import java.util.ArrayList;


public abstract class Subject {
	protected ArrayList<Observer> observers=new ArrayList<>();
	//把观察者对象添加到观察者集合中
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//把观察者对象剔除到观察者集合中
		public void detach(Observer observer) {
			observers.remove(observer);
		}
	
		
		//声明抽象方法
		public abstract void notifyObserver();
}
