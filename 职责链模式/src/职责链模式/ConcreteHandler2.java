package ְ����ģʽ;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=10&&request<20){
			System.out.println("���Ƕ�����ί:10-20����������,������ѡ��"+request+"��");
		}else if (successor!=null) {
			successor.handleRequest(request);
		}
	}


}
