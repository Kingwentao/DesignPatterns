package ÃüÁîÄ£Ê½;

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
		return "¿¾¼¦³á°ò";
	}
}
