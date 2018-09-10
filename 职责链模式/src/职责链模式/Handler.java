package 职责链模式;

public abstract class Handler {
	Handler successor;
   protected void setSuccessor(Handler successor) {
	   this.successor=successor;
}
   public abstract void handleRequest(int request);
}