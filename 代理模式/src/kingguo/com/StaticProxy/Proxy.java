package kingguo.com.StaticProxy;



/**
 * 
 * @author �����
 * ������
 */
public class Proxy implements Subject{

	private Subject subject;
	public Proxy(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}
	@Override
	public void request() {
		System.out.println("�û�ѡ��");	
		subject.request();
		System.out.println("��½�ɹ�");
	}

}
