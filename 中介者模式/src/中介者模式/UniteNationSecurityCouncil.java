package 中介者模式;

public class UniteNationSecurityCouncil extends UnitedNations {

	private USA colleague1;
	private Iraq colleague2;
	

	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}



	public void setColleague2(Iraq colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void Declare(String message, Country colleague) {
		if (colleague==colleague1) {
			colleague1.getMessage(message);
		}else if (colleague==colleague2) {
			colleague2.getMessage(message);
		}
	}
	
}
