package �н���ģʽ;

public class Main {

	public static void main(String[] args) {
		UniteNationSecurityCouncil UNSC=new UniteNationSecurityCouncil();
		USA c1=new USA(UNSC);
		Iraq c2=new Iraq(UNSC);
		UNSC.setColleague1(c1);
		UNSC.setColleague2(c2);
		c1.Declare("��׼�о������������������ս��");
		c2.Declare("����û�к�����");
	}

}
