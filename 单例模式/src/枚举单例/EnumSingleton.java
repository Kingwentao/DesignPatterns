package ö�ٵ���;



public class EnumSingleton {

	//ö�ٵ��� 
	//д������ö�ٵ��������ŵ� �������������ֶλ����з���������ͨ��һ��
	//��Ҫ����Ĭ��ö����Ĵ������̰߳�ȫ��,�������κ������������һ������
	private EnumSingleton(){};

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum instance1=Enum.getInstance();
		Enum instance2=Enum.getInstance();
		System.out.println(instance1==instance2);
	}
	
	enum Enum{
		INSTANCE;
		public static Enum getInstance(){
			return INSTANCE;
		}
	}

}
