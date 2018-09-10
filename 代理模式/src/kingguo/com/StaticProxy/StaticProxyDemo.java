package kingguo.com.StaticProxy;


public class StaticProxyDemo {
	public  static  void main(String[] args) {
		RealSubject realSubject=new RealSubject();
		Proxy proxy=new Proxy(realSubject);
		proxy.request();
		RealSubjectCopy realSubjectCopy=new RealSubjectCopy();
		proxy=new Proxy(realSubjectCopy);
		proxy.request();
	}
}

/**
 * ��̬�����ʵ�ֲ��裺
 * 1.��������Ŀ������ʵ��ͬһ����Ϊ�ӿ�
 * 2.�������Ŀ����ֱ����ʵ�ֽӿ��߼�
 * 3.�ڴ�����Ĺ��캯����ʵ����һ��Ŀ�����
 * 4.�ڴ������е���Ŀ��������Ϊ�ӿ�
 * 5.�ͻ�����Ҫ����Ŀ��������Ϊ�ӿڣ�ֻ��ͨ��������������
 * 

 * Ŀ�����(RealSubject )�Լ��������Proxy����ʵ��������ӿڣ�Subject����
 * �ڴ������Proxy���У�
 * ͨ�����캯������Ŀ�����(RealSubject )��Ȼ����д����ӿڣ�Subject����request()������
 * �ڸ÷����е���Ŀ�����(RealSubject )��request()������
 * ���������һЩ����Ĵ�������Ŀ�����(RealSubject )��request()������ǰ��
 * 
 * 
 * ����ģʽ�ô�
 * ����������������Ҫ��ĳЩģ�鷽������ǰ�����һЩͳһ��ǰ�����������������ӹ��ﳵ��
 * �޸Ķ����Ȳ���ǰ��ͳһ���ϵ�½��֤����־��¼����������ʵ�֣�
 * 
 * ��ʱ����ֵ�����ģʽ�ϳ��ˣ��������ڱ����÷���ǰ������Լ��Ĳ�����
 * ������Ҫ���ı��������Դ�룬���ؽ�����ģ��֮�������ԣ������˼�������ơ�
 * 
 */
