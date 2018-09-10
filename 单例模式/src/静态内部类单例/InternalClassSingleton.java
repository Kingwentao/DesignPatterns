package ��̬�ڲ��൥��;

import ����ģʽ.Singleton;


//�Ƽ�ʹ�õĵ���ģʽ
//��һ�ε���getInstance�������������SingletonHolder�ࡣ
//���ַ�ʽ���Ա�֤�̰߳�ȫ�����ܹ���֤���������Ψһ�ԣ�ͬʱҲ�ӳ��˵�����ʵ����

public class InternalClassSingleton {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InternalClassSingleton singleton1=getSingleton();
		InternalClassSingleton singleton2=getSingleton();
		System.out.println(singleton1==singleton2);
	}
	
	public static InternalClassSingleton getSingleton(){
		return SingletonHolder.singleton;
	}
	
	private static class SingletonHolder{
		private static final InternalClassSingleton singleton=new InternalClassSingleton();
	}

}
