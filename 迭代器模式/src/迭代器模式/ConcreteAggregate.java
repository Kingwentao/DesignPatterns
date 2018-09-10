package 迭代器模式;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体聚集类，继承Aggregate
 * @author 金文韬
 *
 */
public class ConcreteAggregate extends Aggregate {

	private List<Object> items=new ArrayList<Object>();
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}
	
	public int getCount() {
		return items.size();
	}

	public Object getItems(int index) {
		return items.get(index);
	}

	public void insertItems(Object value) {
		items.add(value);
	}
		
}
