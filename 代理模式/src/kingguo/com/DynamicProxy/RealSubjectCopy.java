package kingguo.com.DynamicProxy;

public class RealSubjectCopy implements Subject {

	@Override
	public void request() {
		System.out.println("����Ŀ����󸱱�����½��...");
	}

	@Override
	public void reply() {
		System.out.println("����Ŀ����󸱱����˳���½��...");
		
	}

}
