package 迭代器模式;

/**
 * 具体迭代器类，继承Iterator，实现开始，下一个
 * 是否结尾，当前对象等方法
 * @author 金文韬
 *
 */
public class ConcreteIteratorDesc extends Iterator {

	private ConcreteAggregate aggregate;
	private int current=0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
		this.aggregate=aggregate;
		//此条赋值语句必须放在this.aggregate=aggregate之后执行（不能在定义赋值时使用）
		//否则会引起空指针异常
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
