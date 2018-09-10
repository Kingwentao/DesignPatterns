package 单例模式;



public class Singleton {

	private static Singleton instance;
	private static Object syno=new Object();
	private Singleton() {
	}
	//普通的单例模式
	public static Singleton getInstantce(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	
	//双重锁定，多线程的单例模式
	public static Singleton getInstantce2(){
		if(instance==null){
			synchronized(syno){
				//为什么要双重锁定？
				//第一个锁是为了避免同步带来的性能消耗
				//第二个锁是为了保证实例化一个对象
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
