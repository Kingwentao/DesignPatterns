package DCL单例;

public class DCLSingleton {

	
	//改进了懒汉单例
	//1.在同步之前加上一个判空，这样就不会造成每次调用getSingleton都会进行同步，避免了不必要的开销
	//但是还存在问题？？？
	//singleton=new DCLSingleton();它不是一个原子操作，它其实分为三步  
	//1.先给DCLSingleton分配内存， 2.然后调用它的构造方法初始化成员字段，3.最后将对象指向内存空间
	//在jdk1.5之前，Java Memorize Model（JMM）java内存模型是不能保证2一定在3之前执行的。所以当A线程执行完第三步的时候（第二步还未执行），
	//被切换到了B线程，那么A初始化的对象就被B拿去了，就会造成DCL失效
	//jdk1.5以及之后，加入了volatile关键字，就解决了这个问题 ，，定义时对象时加入这个关键字就可以了
	private DCLSingleton(){};
	
	private static DCLSingleton singleton=null;
	
	//>=jdk1.5
	//private static volatile DCLSingleton singleton=null;
	
	//在大多数情况下，这种情况是可以满足需求的，在jdk版本小于1.5或者在并发情况比较复杂的时候可能会由于JMM在一定概率下发生问题
	//这个方法是在单例下用的最多的
	private static DCLSingleton getSingleton(){
		if (singleton==null) {
			synchronized (DCLSingleton.class) {
				if(singleton==null)
					singleton=new DCLSingleton();
			}
		}
		return singleton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DCLSingleton singleton1=DCLSingleton.getSingleton();
		DCLSingleton singleton2=DCLSingleton.getSingleton();
		System.out.println(singleton1==singleton2);
	}

}
