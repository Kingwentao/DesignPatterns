package 观察者模式;



public class ConcreteOberverOther implements Observer{
	private String observerName;
	
	public ConcreteOberverOther(String observerName) {
		this.observerName=observerName;
	}
	
	@Override
	public void update() {
		System.out.println(observerName+"我要更新一下我的状态了......");
	}
}

