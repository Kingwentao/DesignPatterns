package ��������;

public class HungerSingleton {

	//�������������ڷǳ���������һ���������ʵ����
	//ȱ��:����Ҫ����������ʱ��Ҳ�ᴴ�����˷ѿռ�
	private static HungerSingleton singleton=new HungerSingleton();
	private HungerSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static HungerSingleton getSingleton() {
		return singleton;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HungerSingleton h1=HungerSingleton.getSingleton();
		HungerSingleton h2=HungerSingleton.getSingleton();
		
		System.out.println(h1==h2);
	}

}
