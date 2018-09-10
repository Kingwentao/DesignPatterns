package kingguo.com.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ��̬���� 
 * ��̬������ָ������ʱ��̬���ɴ����ࡣ������������ֽ��뽫������ʱ���ɲ����뵱ǰ����� ClassLoader
 *
 */
public class DynamicProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����Ŀ�����
		RealSubject realSubject=new RealSubject();
		//2.�������ô���������
		ProxyHandler handler=new ProxyHandler(realSubject);
		//��̬���ɴ������
		Subject proxySubject=(Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
		//ͨ�����������÷���
		proxySubject.request();
		proxySubject.reply();
		
		
		RealSubjectCopy realSubjectCopy=new RealSubjectCopy();
		handler=new ProxyHandler(realSubjectCopy);
		proxySubject=(Subject)Proxy.newProxyInstance(RealSubjectCopy.class.getClassLoader(), RealSubjectCopy.class.getInterfaces(), handler);
		proxySubject.request();
		proxySubject.reply();
	}

}

/*��̬����ô�
 * 1.����ҪΪ(RealSubject)дһ����ʽ����ȫһ���ķ�װ�࣬��������ӿڣ�Subject���еķ����ܶ࣬
 * Ϊÿһ���ӿ�дһ��������Ҳ���鷳������ӿ��б䶯����Ŀ�����ʹ����඼Ҫ�޸ģ�������ϵͳά����
 * 2.ʹ��һЩ��̬��������ɷ�����������������ʱ�ƶ��������ִ���߼����Ӷ��������ϵͳ������ԡ�
 * 
 * 
 * 
 * newProxyInstance�������ʵ�������������£�
 * ��һ��������һ���µ��ࡾ�����ࡿ�������ʵ����Class[] interfaces�е����нӿڣ�
 * ��ͨ����ָ����ClassLoader�����ɵ�����ֽ�����ص�JVM�У�����Class����
 * �ڶ������㴫���InvocationHandler��Ϊ��������һ���������ʵ�������ء�
 * 
 * 
 * 
 * ͨ��newProxyInstance�Ͳ�����һ��Subject ��ʵ�������������ʵ��
 * Ȼ��Ϳ���ͨ��Subject .request()���ͻ����InvocationHandler�е�invoke()����
 * ���뷽��Method�����Լ����÷����Ĳ�����ͨ��Method.invoke����RealSubject�еķ�����request()����
 * ͬʱ������InvocationHandler�е�invoke()������������ִ���߼���
 * */
