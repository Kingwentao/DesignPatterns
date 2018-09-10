package 枚举单例;



public class EnumSingleton {

	//枚举单例 
	//写法简单是枚举单例最大的优点 它不仅可以有字段还能有方法，和普通类一样
	//重要的是默认枚举类的创建是线程安全的,并且在任何情况下它都是一个单例
	private EnumSingleton(){};

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum instance1=Enum.getInstance();
		Enum instance2=Enum.getInstance();
		System.out.println(instance1==instance2);
	}
	
	enum Enum{
		INSTANCE;
		public static Enum getInstance(){
			return INSTANCE;
		}
	}

}
