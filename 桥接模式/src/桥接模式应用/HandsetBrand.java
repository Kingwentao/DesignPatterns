package �Ž�ģʽӦ��;

/**
 * ������ֻ�Ʒ����
 * @author �����
 *
 */
abstract class HandsetBrand {
	//ʹ��protecte��֤�������ֱ��ʹ�ô˶���
	protected HandsetSoft handsetSoft;
	//
	public void setHanderSoft(HandsetSoft handsetSoft){
		this.handsetSoft=handsetSoft;
	}
	public abstract void Run();	
}
