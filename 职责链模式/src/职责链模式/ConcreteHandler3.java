package ְ����ģʽ;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request>=20&&request<30){
			System.out.println("����������ί:20-30����������,������ѡ��"+request+"��");
		}else if (successor!=null) {
			successor.handleRequest(request);
		}
	}
	}
