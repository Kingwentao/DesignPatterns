package ������ģʽ;

/**
 * ����������࣬�̳�Iterator��ʵ�ֿ�ʼ����һ��
 * �Ƿ��β����ǰ����ȷ���
 * @author �����
 *
 */
public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current=0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate=aggregate;
	}
	@Override
	public Object First() {
		return aggregate.getItems(0);
	}

	@Override
	public Object Next() {
		Object ret=null;
		current++;
		if(current<aggregate.getCount()){
			ret=aggregate.getItems(current);
		}
		return ret;
	}
	@Override
	public boolean isDone() {
		return current<aggregate.getCount()?false:true;
	}
	@Override
	public Object CurrentItem() {
		return aggregate.getItems(current);
	}
	
}
