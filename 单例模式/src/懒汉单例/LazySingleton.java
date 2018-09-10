package ��������;

public class LazySingleton {

	
	/**
	 * ��������:����Ҫ��ʱ��ż���ʵ��
	 * ȱ��:��һ�μ��رȽ���������ÿ�ε�����������������ͬ��������˲���Ҫ�Ŀ���
	 * ���߳��±�֤��������Ψһ�ԣ�����Ҫ����ͬ���ؼ���
	 */
	private LazySingleton(){};
	
	private static LazySingleton singleton=null;
	
	public static  synchronized LazySingleton getSingleton() {
		if(singleton==null){
			singleton=new LazySingleton();
		}
		return singleton;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingleton singleton1=LazySingleton.getSingleton();
		LazySingleton singleton2=LazySingleton.getSingleton();
		System.out.println(singleton1==singleton2);
	}

}
