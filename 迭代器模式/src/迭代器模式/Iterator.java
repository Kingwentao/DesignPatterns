package ������ģʽ;
/**
 * �����������࣬���ڶ���õ���ʼ�Ķ�����һ������
 * �ж��Ƿ񵽽�β����ǰ����ȳ��󷽷�
 * @author �����
 */
public abstract class Iterator {
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean isDone();
	public abstract Object CurrentItem();
}
