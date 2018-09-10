package 命令模式;

public class Main {

	public static void main(String[] args) {
		//开店前准备
		Barbecue eater=new Barbecue();
		Barbecue eater1=new Barbecue();
		Command bakeMuttonCommand1=new BakeMuttonCommand(eater);
		Command bakeChickenCommand1=new BakeChickenWingCommand(eater);
		Command bakeChickenCommand2=new BakeChickenWingCommand(eater1);
		Waiter girl=new Waiter();
		
		//开店营业,准备订单
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeChickenCommand1);
		girl.setOrder(bakeChickenCommand1);
		girl.setOrder(bakeChickenCommand2);
		
		//取消订单
		girl.cancelOrder(bakeChickenCommand2);
		//通知厨师完成订单
		girl.notifyOrder();
	
	}
}

/*命名模式总结:
 *1.对一个请求（烤鸡翅）封装为一个对象（命令的对象），从而使你可用不同的请求对客户进行参数化；
 *  对请求排队或记录请求日志，以及支持可撤销的操作。
 *2.命令模式优点：
 *（1）容易设计一个命令队列
 *（2）需要的情况下，容易的将命令记入日志
 *（3）允许接受请求的一方是否否决请求
 *（4）可以容易的实现请求的撤销和重做
 *（5）增加新的命令类很容易
 * 最关键的优点是：可以很容易的把请求操作的对象与知道怎么执行一个操作的对象分割开
 * 
 *
 */
 