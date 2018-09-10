package 中介者模式;

//国家类
public abstract class Country {

	protected UnitedNations mediator;
	public Country(UnitedNations mediator) {
		this.mediator=mediator;
	}
}
