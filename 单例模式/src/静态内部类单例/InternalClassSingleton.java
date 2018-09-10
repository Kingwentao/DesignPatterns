package 静态内部类单例;

import 单例模式.Singleton;


//推荐使用的单例模式
//第一次调用getInstance会让虚拟机加载SingletonHolder类。
//这种方式可以保证线程安全，还能够保证单例对象的唯一性，同时也延迟了单例的实例化

public class InternalClassSingleton {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InternalClassSingleton singleton1=getSingleton();
		InternalClassSingleton singleton2=getSingleton();
		System.out.println(singleton1==singleton2);
	}
	
	public static InternalClassSingleton getSingleton(){
		return SingletonHolder.singleton;
	}
	
	private static class SingletonHolder{
		private static final InternalClassSingleton singleton=new InternalClassSingleton();
	}

}
