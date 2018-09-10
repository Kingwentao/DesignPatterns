package 命令模式;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Waiter {
	public List<Command> orders=new ArrayList<>();
	String orderTime;
	Date nowTime=new Date();
	
	//设置订单
	public void setOrder(Command command) {
		if (command.toString()=="烤羊肉串") {
			System.out.println("不好意思，今日羊肉串已卖完");
		}
		else{
			dateFormat();
			orders.add(command);
			System.out.println("增加订单："+command.toString()+"  下单时间:"+orderTime);
		}
	}
	//取消订单
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("取消订单："+command.toString()+"  取消订单时间:"+orderTime);
	}
	//订单任务全部执行
	public void notifyOrder() {
		for (Command order : orders) {
			order.ExecuteCommand();
		}	
	}
	//时间格式化
	public void dateFormat() {
		SimpleDateFormat time=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		orderTime=time.format(nowTime);
	}
}
