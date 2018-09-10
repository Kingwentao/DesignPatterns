package kingguo.com.StaticProxy;


public class StaticProxyDemo {
	public  static  void main(String[] args) {
		RealSubject realSubject=new RealSubject();
		Proxy proxy=new Proxy(realSubject);
		proxy.request();
		RealSubjectCopy realSubjectCopy=new RealSubjectCopy();
		proxy=new Proxy(realSubjectCopy);
		proxy.request();
	}
}

/**
 * 静态代理的实现步骤：
 * 1.代理对象和目标对象均实现同一个行为接口
 * 2.代理类和目标类分别具体实现接口逻辑
 * 3.在代理类的构造函数中实例化一个目标对象
 * 4.在代理类中调用目标对象的行为接口
 * 5.客户端想要调用目标对象的行为接口，只能通过代理类来操作
 * 

 * 目标对象(RealSubject )以及代理对象（Proxy）都实现了主题接口（Subject）。
 * 在代理对象（Proxy）中，
 * 通过构造函数传入目标对象(RealSubject )，然后重写主题接口（Subject）的request()方法，
 * 在该方法中调用目标对象(RealSubject )的request()方法，
 * 并可以添加一些额外的处理工作在目标对象(RealSubject )的request()方法的前后
 * 
 * 
 * 代理模式好处
 * 假如有这样的需求，要在某些模块方法调用前后加上一些统一的前后处理操作，比如在添加购物车、
 * 修改订单等操作前后统一加上登陆验证与日志记录处理，该怎样实现？
 * 
 * 这时候就轮到代理模式上场了，它可以在被调用方法前后加上自己的操作，
 * 而不需要更改被调用类的源码，大大地降低了模块之间的耦合性，体现了极大的优势。
 * 
 */
