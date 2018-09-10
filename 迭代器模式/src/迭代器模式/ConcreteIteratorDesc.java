package ������ģʽ;

/**
 * ����������࣬�̳�Iterator��ʵ�ֿ�ʼ����һ��
 * �Ƿ��β����ǰ����ȷ���
 * @author �����
 *
 */
public class ConcreteIteratorDesc extends Iterator {

	private ConcreteAggregate aggregate;
	private int current=0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate=aggregate;
		//������ֵ���������this.aggregate=aggregate֮��ִ�У������ڶ��帳ֵʱʹ�ã�
		//����������ָ���쳣
		current=aggregate.getCount()-1;
	}
	@Override
	public Object First() {
		return aggregate.getItems(aggregate.getCount()-1);
	}

	@Override
	public Object Next() {
		Object ret=null;
		current--;
		if(current>0){
			ret=aggregate.getItems(current);
		}
		return ret;
	}
	@Override
	public boolean isDone() {
		return current>=0?false:true;
	}
	@Override
	public Object CurrentItem() {
		return aggregate.getItems(current);
	}
	
}
