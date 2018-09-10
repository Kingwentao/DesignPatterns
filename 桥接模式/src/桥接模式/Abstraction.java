package 桥接模式;

public class Abstraction {
	protected Implementor implementor;
	public void setImplement(Implementor implementor){
		this.implementor=implementor;
	}
	public void Operation(){
		implementor.Operation();
		System.out.println("桥接类");
	}
}
