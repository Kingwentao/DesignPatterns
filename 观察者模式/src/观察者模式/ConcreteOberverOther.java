package �۲���ģʽ;



public class ConcreteOberverOther implements Observer{
	private String observerName;
	
	public ConcreteOberverOther(String observerName) {
		this.observerName=observerName;
	}
	
	@Override
	public void update() {
		System.out.println(observerName+"��Ҫ����һ���ҵ�״̬��......");
	}
}

