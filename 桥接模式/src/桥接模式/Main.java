package ге╫сдёй╫;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction abstraction=new RefinedAbstraction();
		abstraction.setImplement(new ConcreteImplementorA());
		abstraction.Operation();
		
		abstraction.setImplement(new GameImplementor());
		abstraction.Operation();
	}
}
