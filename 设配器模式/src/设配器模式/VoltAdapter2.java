package ������ģʽ;

//����������
public class VoltAdapter2 implements FiveVoit{
	Volt220 mVolt220;
	
	public VoltAdapter2(Volt220 mVolt220) {
		this.mVolt220=mVolt220;
	}
	
	public int getVolt220() {
		return mVolt220.getVolt220();
	}

	@Override
	public int getVolt5() {
		return 5;
	}
		
}
