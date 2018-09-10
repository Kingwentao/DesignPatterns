package kingguo.com.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理 
 * 动态代理是指在运行时动态生成代理类。即，代理类的字节码将在运行时生成并载入当前代理的 ClassLoader
 *
 */
public class DynamicProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建目标对象
		RealSubject realSubject=new RealSubject();
		//2.创建调用处理器对象
		ProxyHandler handler=new ProxyHandler(realSubject);
		//动态生成代理对象
		Subject proxySubject=(Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
		//通过代理对象调用方法
		proxySubject.request();
		proxySubject.reply();
		
		
		RealSubjectCopy realSubjectCopy=new RealSubjectCopy();
		handler=new ProxyHandler(realSubjectCopy);
		proxySubject=(Subject)Proxy.newProxyInstance(RealSubjectCopy.class.getClassLoader(), RealSubjectCopy.class.getInterfaces(), handler);
		proxySubject.request();
		proxySubject.reply();
	}

}

/*动态代理好处
 * 1.不需要为(RealSubject)写一个形式上完全一样的封装类，假如主题接口（Subject）中的方法很多，
 * 为每一个接口写一个代理方法也很麻烦。如果接口有变动，则目标对象和代理类都要修改，不利于系统维护；
 * 2.使用一些动态代理的生成方法甚至可以在运行时制定代理类的执行逻辑，从而大大提升系统的灵活性。
 * 
 * 
 * 
 * newProxyInstance这个方法实际上做了两件事：
 * 第一，创建了一个新的类【代理类】，这个类实现了Class[] interfaces中的所有接口，
 * 并通过你指定的ClassLoader将生成的类的字节码加载到JVM中，创建Class对象；
 * 第二，以你传入的InvocationHandler作为参数创建一个代理类的实例并返回。
 * 
 * 
 * 
 * 通过newProxyInstance就产生了一个Subject 的实例，即代理类的实例
 * 然后就可以通过Subject .request()，就会调用InvocationHandler中的invoke()方法
 * 传入方法Method对象，以及调用方法的参数，通过Method.invoke调用RealSubject中的方法的request()方法
 * 同时可以在InvocationHandler中的invoke()方法加入其他执行逻辑。
 * */
