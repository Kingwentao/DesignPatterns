package 设配器模式;

public class Test {

	public static void main(String[] args) {

		
		//类适配器的测试
		VoltAdapter adapter=new VoltAdapter();
		int beforeVolt=adapter.getVolt220();
		System.out.println("未适配前的电压"+beforeVolt+"V");
		int afterVolt=adapter.getVolt5();
		System.out.println("适配后的电压"+afterVolt+"V");
		int afterVolt2=adapter.getVolt10();
		System.out.println("适配后的电压"+afterVolt2+"V");
		System.out.println("----------------------------------------------");
		//对象设配器的测试
		VoltAdapter2 voltAdapter2=new VoltAdapter2(new Volt220());
		System.out.println("适配后的电压"+voltAdapter2.getVolt5());
	}

}
