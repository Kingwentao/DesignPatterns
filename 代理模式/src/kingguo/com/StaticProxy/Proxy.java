package kingguo.com.StaticProxy;



/**
 * 
 * @author 金文韬
 * 代理类
 */
public class Proxy implements Subject{

	private Subject subject;
	public Proxy(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}
	@Override
	public void request() {
		System.out.println("用户选择");	
		subject.request();
		System.out.println("登陆成功");
	}

}
