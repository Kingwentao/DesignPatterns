package ����ģʽ;

public class Main {

	public static void main(String[] args) {
		//����ǰ׼��
		Barbecue eater=new Barbecue();
		Barbecue eater1=new Barbecue();
		Command bakeMuttonCommand1=new BakeMuttonCommand(eater);
		Command bakeChickenCommand1=new BakeChickenWingCommand(eater);
		Command bakeChickenCommand2=new BakeChickenWingCommand(eater1);
		Waiter girl=new Waiter();
		
		//����Ӫҵ,׼������
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeChickenCommand1);
		girl.setOrder(bakeChickenCommand1);
		girl.setOrder(bakeChickenCommand2);
		
		//ȡ������
		girl.cancelOrder(bakeChickenCommand2);
		//֪ͨ��ʦ��ɶ���
		girl.notifyOrder();
	
	}
}

/*����ģʽ�ܽ�:
 *1.��һ�����󣨿����ᣩ��װΪһ����������Ķ��󣩣��Ӷ�ʹ����ò�ͬ������Կͻ����в�������
 *  �������Ŷӻ��¼������־���Լ�֧�ֿɳ����Ĳ�����
 *2.����ģʽ�ŵ㣺
 *��1���������һ���������
 *��2����Ҫ������£����׵Ľ����������־
 *��3��������������һ���Ƿ�������
 *��4���������׵�ʵ������ĳ���������
 *��5�������µ������������
 * ��ؼ����ŵ��ǣ����Ժ����׵İ���������Ķ�����֪����ôִ��һ�������Ķ���ָ
 * 
 *
 */
 