package 懒汉单例;

public class LazySingleton {

	
	/**
	 * 懒汉单例:在需要的时候才加载实例
	 * 缺点:第一次加载比较慢，并且每次调用这个方法都会进行同步，造成了不必要的开销
	 * 多线程下保证单例对象唯一性，所以要加上同步关键字
	 */
	private LazySingleton(){};
	
	private static LazySingleton singleton=null;
	
	public static  synchronized LazySingleton getSingleton() {
		if(singleton==null){
			singleton=new LazySingleton();
		}
		return singleton;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton singleton1=LazySingleton.getSingleton();
		LazySingleton singleton2=LazySingleton.getSingleton();
		System.out.println(singleton1==singleton2);
	}

}
