package 桥接模式应用;

/**
 * 抽象的手机品牌类
 * @author 金文韬
 *
 */
abstract class HandsetBrand {
	//使用protecte保证子类可以直接使用此对象
	protected HandsetSoft handsetSoft;
	//
	public void setHanderSoft(HandsetSoft handsetSoft){
		this.handsetSoft=handsetSoft;
	}
	public abstract void Run();	
}
