package kingguo.com.DynamicProxy;



/**
 * 
 * @author 金文韬
 *目标对象
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("我是目标对象，登陆中...");
	}

	@Override
	public void reply() {
		System.out.println("我是目标对象，退出登陆中...");
		
	}

}

