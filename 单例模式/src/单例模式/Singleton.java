package ����ģʽ;



public class Singleton {

	private static Singleton instance;
	private static Object syno=new Object();
	private Singleton() {
	}
	//��ͨ�ĵ���ģʽ
	public static Singleton getInstantce(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	
	//˫�����������̵߳ĵ���ģʽ
	public static Singleton getInstantce2(){
		if(instance==null){
			synchronized(syno){
				//ΪʲôҪ˫��������
				//��һ������Ϊ�˱���ͬ����������������
				//�ڶ�������Ϊ�˱�֤ʵ����һ������
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
