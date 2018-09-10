package 单例模式;

public class Main {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstantce2();
		Singleton s2=Singleton.getInstantce2();
		System.out.println("两个对象是否为相同的实例:"+(s1==s2));
		
	}

}
