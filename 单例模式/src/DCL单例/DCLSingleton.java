package DCL����;

public class DCLSingleton {

	
	//�Ľ�����������
	//1.��ͬ��֮ǰ����һ���пգ������Ͳ������ÿ�ε���getSingleton�������ͬ���������˲���Ҫ�Ŀ���
	//���ǻ��������⣿����
	//singleton=new DCLSingleton();������һ��ԭ�Ӳ���������ʵ��Ϊ����  
	//1.�ȸ�DCLSingleton�����ڴ棬 2.Ȼ��������Ĺ��췽����ʼ����Ա�ֶΣ�3.��󽫶���ָ���ڴ�ռ�
	//��jdk1.5֮ǰ��Java Memorize Model��JMM��java�ڴ�ģ���ǲ��ܱ�֤2һ����3֮ǰִ�еġ����Ե�A�߳�ִ�����������ʱ�򣨵ڶ�����δִ�У���
	//���л�����B�̣߳���ôA��ʼ���Ķ���ͱ�B��ȥ�ˣ��ͻ����DCLʧЧ
	//jdk1.5�Լ�֮�󣬼�����volatile�ؼ��֣��ͽ����������� ��������ʱ����ʱ��������ؼ��־Ϳ�����
	private DCLSingleton(){};
	
	private static DCLSingleton singleton=null;
	
	//>=jdk1.5
	//private static volatile DCLSingleton singleton=null;
	
	//�ڴ��������£���������ǿ�����������ģ���jdk�汾С��1.5�����ڲ�������Ƚϸ��ӵ�ʱ����ܻ�����JMM��һ�������·�������
	//����������ڵ������õ�����
	private static DCLSingleton getSingleton(){
		if (singleton==null) {
			synchronized (DCLSingleton.class) {
				if(singleton==null)
					singleton=new DCLSingleton();
			}
		}
		return singleton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DCLSingleton singleton1=DCLSingleton.getSingleton();
		DCLSingleton singleton2=DCLSingleton.getSingleton();
		System.out.println(singleton1==singleton2);
	}

}
