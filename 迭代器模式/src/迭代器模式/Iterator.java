package 迭代器模式;
/**
 * 迭代器抽象类，用于定义得到开始的对象，下一个对象，
 * 判断是否到结尾，当前对象等抽象方法
 * @author 金文韬
 */
public abstract class Iterator {
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean isDone();
	public abstract Object CurrentItem();
}
