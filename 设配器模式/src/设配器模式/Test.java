package ������ģʽ;

public class Test {

	public static void main(String[] args) {

		
		//���������Ĳ���
		VoltAdapter adapter=new VoltAdapter();
		int beforeVolt=adapter.getVolt220();
		System.out.println("δ����ǰ�ĵ�ѹ"+beforeVolt+"V");
		int afterVolt=adapter.getVolt5();
		System.out.println("�����ĵ�ѹ"+afterVolt+"V");
		int afterVolt2=adapter.getVolt10();
		System.out.println("�����ĵ�ѹ"+afterVolt2+"V");
		System.out.println("----------------------------------------------");
		//�����������Ĳ���
		VoltAdapter2 voltAdapter2=new VoltAdapter2(new Volt220());
		System.out.println("�����ĵ�ѹ"+voltAdapter2.getVolt5());
	}

}
