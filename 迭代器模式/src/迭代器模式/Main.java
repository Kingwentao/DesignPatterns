package ������ģʽ;

public class Main {

	public static void main(String[] args) {
	   ConcreteAggregate concreteAggregate=new ConcreteAggregate();
	   concreteAggregate.insertItems("��Һã�");
	   concreteAggregate.insertItems("������Ů���ѣ�");
	   concreteAggregate.insertItems("Are you kidding me");
	   Iterator iterator1=new ConcreteIterator(concreteAggregate);
	   Iterator iterator=new ConcreteIteratorDesc(concreteAggregate);
	   //Object items=iterator.First();
	   while (!iterator.isDone()) {
		System.out.println(iterator.CurrentItem());
		iterator.Next();
	}
	   System.out.println("--------------");
	   while (!iterator1.isDone()) {
			System.out.println(iterator1.CurrentItem());
			iterator1.Next();
		}
	}
}


/*
 * 1.����Iterator������Ŀ����ʲô��
 * Ϊʲô��ֱ��ֱ�Ӵ���ConcreteIterato�����������ķ�����
 * 
 * A:��Ϊ����ķ�ʽ�кܶ��֣�����ʹ��һ���������һ���ӿڣ�����ʵ�ֶ��ַ�ʽ������
 * �������������Ǿʹ�����ConcreteIteratorDesc�������е���
 */
