package ְ����ģʽ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		//�������������ϼ����¼�
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		int[] requests={2,8,15,20,25,29};
		for (int request : requests) {
			h1.handleRequest(request);
		}
	}
}

/*1.������ģʽ
 * ����һ������ĸ����ִ���Ȩ�޲�ͬ������ʹ��������ģʽ���ԺܺõĴ���
 * ĳ��Ȩ�޲����������Ȩ�޸��ߵ�������
 * 
 */
