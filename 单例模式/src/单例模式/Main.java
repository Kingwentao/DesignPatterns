package ����ģʽ;

public class Main {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstantce2();
		Singleton s2=Singleton.getInstantce2();
		System.out.println("���������Ƿ�Ϊ��ͬ��ʵ��:"+(s1==s2));
		
	}

}
