package kingguo.com.StaticProxy;

public class RealSubjectCopy implements Subject {

	@Override
	public void request() {
		System.out.println("我是目标对象副本，登陆中...");

	}

}
