package ����ģʽ;

public abstract class Command {
	protected Barbecue receiver;
	public Command(Barbecue receiver) {
		this.receiver=receiver;
	}
	
	abstract public void ExecuteCommand();
}
