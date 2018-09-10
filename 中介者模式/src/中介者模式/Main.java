package 中介者模式;

public class Main {

	public static void main(String[] args) {
		UniteNationSecurityCouncil UNSC=new UniteNationSecurityCouncil();
		USA c1=new USA(UNSC);
		Iraq c2=new Iraq(UNSC);
		UNSC.setColleague1(c1);
		UNSC.setColleague2(c2);
		c1.Declare("不准研究核武器，否则会引起战争");
		c2.Declare("我们没有核武器");
	}

}
