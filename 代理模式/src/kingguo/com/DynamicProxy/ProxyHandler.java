package kingguo.com.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * ������ĵ��ô�����
 * @author �����
 *
 */
public class ProxyHandler implements InvocationHandler{

	private Subject subject;
	public ProxyHandler(Subject subject) {
		this.subject=subject;
	}
	
	

	
	 /*
	  * �ڴ����������κ�һ������ʱ������õ�,������ͬ�ᵼ�µڶ�������method��ͬ
	  * ��һ�������Ǵ�����󣨱�ʾ�ĸ�������������method������
	  * �ڶ��������� Method ���󣨱�ʾ�ĸ������������ˣ�
	  * ������������ָ�����÷����Ĳ���
	  */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Exception
	{
		//����Ԥ����Ĺ�������Ȼ��Ҳ���Ը��� method �Ĳ�ͬ���в�ͬ��Ԥ������
        System.out.println("====before====");
       //����RealSubject�еķ���
        Object result = method.invoke(subject, args);
        System.out.println("====after====");
        return result;		
	}

}


/**
 * InvocationHandler
 * �������Ϊ�����ô�������������һ���ӿڡ�
 * �����ö�̬�������еķ���ʱ������ֱ��ת�ӵ�ִ���Զ����InvocationHandler�е�invoke()������
 * �����Ƕ�̬���ɵĴ�������Ҫ��ɵľ���������Ҫ�Լ�����һ���࣬
 * ����������ʵ�� InvocationHandler �ӿڣ�ͨ����дinvoke()������ִ�о������ݡ�
 */