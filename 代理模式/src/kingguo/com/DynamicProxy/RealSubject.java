package kingguo.com.DynamicProxy;



/**
 * 
 * @author �����
 *Ŀ�����
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("����Ŀ����󣬵�½��...");
	}

	@Override
	public void reply() {
		System.out.println("����Ŀ������˳���½��...");
		
	}

}

