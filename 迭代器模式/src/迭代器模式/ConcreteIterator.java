package 迭代器模式;

/**
 * 具体迭代器类，继承Iterator，实现开始，下一个
 * 是否结尾，当前对象等方法
 * @author 金文韬
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
