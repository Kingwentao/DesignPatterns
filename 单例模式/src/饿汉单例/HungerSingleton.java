package 饿汉单例;

public class HungerSingleton {

	//饿汉单例：由于非常饥饿，在一创建对象就实例化
	//缺点:不需要的这个对象的时候也会创建，浪费空间
	private static HungerSingleton singleton=new HungerSingleton();
	private HungerSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static HungerSingleton getSingleton() {
		return singleton;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HungerSingleton h1=HungerSingleton.getSingleton();
		HungerSingleton h2=HungerSingleton.getSingleton();
		
		System.out.println(h1==h2);
	}

}
