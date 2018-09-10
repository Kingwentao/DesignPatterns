package kingguo.com.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 代理类的调用处理器
 * @author 金文韬
 *
 */
public class ProxyHandler implements InvocationHandler{

	private Subject subject;
	public ProxyHandler(Subject subject) {
		this.subject=subject;
	}
	
	

	
	 /*
	  * 在代理对象调用任何一个方法时都会调用的,方法不同会导致第二个参数method不同
	  * 第一个参数是代理对象（表示哪个代理对象调用了method方法）
	  * 第二个参数是 Method 对象（表示哪个方法被调用了）
	  * 第三个参数是指定调用方法的参数
	  */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Exception
	{
		//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        System.out.println("====before====");
       //调用RealSubject中的方法
        Object result = method.invoke(subject, args);
        System.out.println("====after====");
        return result;		
	}

}


/**
 * InvocationHandler
 * 这里称他为”调用处理器”，它是一个接口。
 * 当调用动态代理类中的方法时，将会直接转接到执行自定义的InvocationHandler中的invoke()方法。
 * 即我们动态生成的代理类需要完成的具体内容需要自己定义一个类，
 * 而这个类必须实现 InvocationHandler 接口，通过重写invoke()方法来执行具体内容。
 */