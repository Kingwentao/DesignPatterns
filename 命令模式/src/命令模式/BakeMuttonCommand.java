package ÃüÁîÄ£Ê½;

public class BakeMuttonCommand extends Command {

	
	public BakeMuttonCommand(Barbecue receiver) {
		super(receiver);
	}

	@Override
	public void ExecuteCommand() {
		receiver.BakeMutton();
	}
		
	@Override
	public String toString() {
		return "¿¾ÑòÈâ´®";
	}
}
