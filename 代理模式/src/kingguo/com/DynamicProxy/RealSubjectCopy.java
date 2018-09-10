package kingguo.com.DynamicProxy;

public class RealSubjectCopy implements Subject {

	@Override
	public void request() {
		System.out.println("我是目标对象副本，登陆中...");
	}

	@Override
	public void reply() {
		System.out.println("我是目标对象副本，退出登陆中...");
		
	}

}
