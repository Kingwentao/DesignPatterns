package 设配器模式;


//类设配器角色
public class VoltAdapter extends Volt220 implements FiveVoit,TenVoit{

	@Override
	public int getVolt5() {
		// 返回5v的电压
		return 5;
	}

	@Override
	public int getVolt10() {
		// TODO Auto-generated method stub
		return 10;
	}

}
