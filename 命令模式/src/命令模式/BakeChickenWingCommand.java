package ����ģʽ;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecue receiver) {
		super(receiver);
	}

	@Override
	public void ExecuteCommand() {
		receiver.BakeChickenWing();	
	}
	@Override
	public String toString() {
		return "�������";
	}
}
