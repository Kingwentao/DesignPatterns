package ����ģʽ;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Waiter {
	public List<Command> orders=new ArrayList<>();
	String orderTime;
	Date nowTime=new Date();
	
	//���ö���
	public void setOrder(Command command) {
		if (command.toString()=="�����⴮") {
			System.out.println("������˼���������⴮������");
		}
		else{
			dateFormat();
			orders.add(command);
			System.out.println("���Ӷ�����"+command.toString()+"  �µ�ʱ��:"+orderTime);
		}
	}
	//ȡ������
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("ȡ��������"+command.toString()+"  ȡ������ʱ��:"+orderTime);
	}
	//��������ȫ��ִ��
	public void notifyOrder() {
		for (Command order : orders) {
			order.ExecuteCommand();
		}	
	}
	//ʱ���ʽ��
	public void dateFormat() {
		SimpleDateFormat time=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		orderTime=time.format(nowTime);
	}
}
