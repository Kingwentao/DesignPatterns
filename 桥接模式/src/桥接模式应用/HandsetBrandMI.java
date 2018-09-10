package 桥接模式应用;


/**
 * 具体的小米手机类
 * @author 金文韬
 *
 */
public class HandsetBrandMI extends HandsetBrand{

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("小米手机，正在安装软件...");
		handsetSoft.Run();
	}
	
}
