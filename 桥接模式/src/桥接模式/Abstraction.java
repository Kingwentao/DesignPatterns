package �Ž�ģʽ;

public class Abstraction {
	protected Implementor implementor;
	public void setImplement(Implementor implementor){
		this.implementor=implementor;
	}
	public void Operation(){
		implementor.Operation();
		System.out.println("�Ž���");
	}
}
