package 迭代器模式;

public class Main {

	public static void main(String[] args) {
	   ConcreteAggregate concreteAggregate=new ConcreteAggregate();
	   concreteAggregate.insertItems("大家好，");
	   concreteAggregate.insertItems("这是我女朋友，");
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
 * 1.创建Iterator抽象类目的是什么？
 * 为什么不直接直接创建ConcreteIterato对象调用里面的方法？
 * 
 * A:因为排序的方式有很多种，我们使用一个抽象类或一个接口，可以实现多种方式的排序
 * 比如在这里我们就创建了ConcreteIteratorDesc倒序排列的类
 */
