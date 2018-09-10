package 桥接模式应用;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化小米手机，对其安装软件
		HandsetBrand XiaoMi=new HandsetBrandMI();
		//安装手游
		XiaoMi.setHanderSoft(new HandGame());
		XiaoMi.Run();
		//安装音乐
		XiaoMi.setHanderSoft(new MusicSoft());
		XiaoMi.Run();
		
		//实例化华为手机类，对其安装软件
		HandsetBrand Huawei=new HandseBrandHuaWei();
		Huawei.setHanderSoft(new HandGame());
		Huawei.Run();
		Huawei.setHanderSoft(new MusicSoft());
		Huawei.Run();
	}
}
