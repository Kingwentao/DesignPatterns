package �Ž�ģʽӦ��;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����С���ֻ������䰲װ���
		HandsetBrand XiaoMi=new HandsetBrandMI();
		//��װ����
		XiaoMi.setHanderSoft(new HandGame());
		XiaoMi.Run();
		//��װ����
		XiaoMi.setHanderSoft(new MusicSoft());
		XiaoMi.Run();
		
		//ʵ������Ϊ�ֻ��࣬���䰲װ���
		HandsetBrand Huawei=new HandseBrandHuaWei();
		Huawei.setHanderSoft(new HandGame());
		Huawei.Run();
		Huawei.setHanderSoft(new MusicSoft());
		Huawei.Run();
	}
}
